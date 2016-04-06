package com.lexiang.main.web.controller.upload;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

import org.apache.http.client.HttpClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.lexiang.main.common.utils.LoggerUtils;
import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.mapper.po.UpBook;
import com.lexiang.main.mapper.utils.ExcelReadUtils;
import com.lexiang.main.service.BookUploadService;
import com.lexiang.main.service.impl.BookUploadServiceImpl;

/**
 * 
 * <p>Title: BookUploadController.java</p>
 * <p>Description: 图书上传处理类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月21日下午9:41:57
 * @version 1.0
 */
@Controller
@RequestMapping("/upload")
public class BookUploadController {

	@Resource
	private BookUploadService bookUploadServiceImpl;
	
	@RequestMapping("/book")
	public String uploadBook(String bookName,MultipartFile pictureFile) throws RuntimeException, IOException{
		if(pictureFile != null){
			System.out.println(pictureFile.getOriginalFilename());
			//原始图片名称
			String originalFilename = pictureFile.getOriginalFilename();
			//如果没有图片名称，则上传不成功
			if(originalFilename != null && originalFilename.length()>0)
			{
				//存放图片的物理路径
				String picPath = "D:\\other\\";
				//新文件的名称
				String newFileName = UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
		
				//新的文件
				File newFile = new File(picPath+newFileName);
				//把上传的文件保存成一个新的文件
				pictureFile.transferTo(newFile);
				//同时需要把新的文件名更新到数据库中
			}else{
				throw new RuntimeException("图片名称不存在，上传不成功");
			}
		}
		// 根据页面传入的商品信息，调用修改方法，进行修改（此时还没有讲参数绑定，暂时无法进行）
		//itemsService.updateItemsById(items.getId(), items);
		return "success";
	}
	
	/**
	 * 
	 * <p>Title: uploadExe</p>
	 * <p>Description:上传exe文件  从exe中读取 录入的图书信息 存入数据库中 </p>
	 * @param pictureFile exe文件  编号  图书名称  格式  作者  分类   访问路径 密码  
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/excel")
	public String uploadExcel(MultipartFile exeFile) {
		
		if(exeFile != null){
			
			//原始图片名称
			String originalFilename = exeFile.getOriginalFilename();
			//如果没有名称，则上传不成功
			if(originalFilename != null && originalFilename.length()>0 )
			{
				if(originalFilename.endsWith("xls")){
					try {
						//使用POI工具类读取excel文件中的信息
						InputStream is = exeFile.getInputStream();
						
						ExcelReadUtils readUtils = new ExcelReadUtils();
						
						List<UpBook> books = readUtils.getDataForExcel7(is);

						ResultData<Boolean> result = bookUploadServiceImpl.addBooks(books);
						
						//这里应该传回result  有待优化
					} catch (IOException e) {
						LoggerUtils.getLogger().error("",e);
					}
					
					return "success";
				}else{
					throw  new RuntimeException("非法文件,请使用xls文件");
				}
		   }
		}
		return "error";
	}
	/**
	 * 
	 * <p>Title: updateBookInfo</p>
	 * <p>Description:更新图书信息 </p>
	 * @param book
	 * @return
	 */
	@RequestMapping("/update/book")
	public String updateBookInfo(UpBook book){
		
		if(book.getBookId()!= 0){
			ResultData<Boolean> result = bookUploadServiceImpl.updateBook(book);
			
			Boolean data = result.getMateData();
			if(data){
				return "success";
			}
			
		}
		return "error";
	}
	
}
