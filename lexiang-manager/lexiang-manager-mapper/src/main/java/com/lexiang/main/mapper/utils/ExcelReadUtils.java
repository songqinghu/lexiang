package com.lexiang.main.mapper.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lexiang.main.mapper.po.UpBook;
import com.mysql.jdbc.interceptors.ServerStatusDiffInterceptor;

/**
 * 
 * <p>Title: ExcelReadUtils.java</p>
 * <p>Description: 操作excel文件的工具类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月23日下午11:39:39
 * @version 1.0
 */
public class ExcelReadUtils {

	private static  Logger logger  = LoggerFactory.getLogger(ExcelReadUtils.class);
	
	private POIFSFileSystem fs;
	
	private HSSFWorkbook  hw; //文件
	
	private HSSFSheet  sheet;//页面
	
	private HSSFRow  row;//行
	
	
	/**
	 * 
	 * <p>Title: getDataForExcel7</p>
	 * <p>Description:从excel7中读取数据  </p>
	 * @return
	 */
	public List<UpBook> getDataForExcel7(InputStream is){
		
		logger.info("date{},content{}", new Date(),"读取excel文件 start");
		
		List<UpBook> books =null;
		try {
			books= new ArrayList<UpBook>();
			fs = new POIFSFileSystem(is); //文件系统
			
			hw = new  HSSFWorkbook(fs);//表格读取
			
			sheet = hw.getSheetAt(0); //读取第一页
			
			int maxRow = sheet.getLastRowNum();//最大行数
			
			row = sheet.getRow(0);
			
			int cellNum = row.getPhysicalNumberOfCells();//列数目 --5个
			
			for (int i = 1; i <= maxRow; i++) {
				
				row = sheet.getRow(i);
				UpBook book = new UpBook();
				for (int j = 0; j < 5; j++) {
					HSSFCell cell = row.getCell(j);
					String value = cell.toString();
					if(j==0){
						book.setBookname(value);
					}else if(j==1){
						book.setBooktype(value);
					}else if(j==2){
						book.setAuthor(value);
					}else if(j==3){
						book.setUrlpath(value);
					}else if(j==4){
						book.setPassword(value);
					}
				}
				books.add(book);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		logger.info("date{},content{},个数{}", new Date(),"读取excel文件 end",books.size());
		return books;
	}
	
	/**
	 * 
	 * <p>Title: getDataForExcel3</p>
	 * <p>Description: 从excel3中读取数据</p>
	 * @return
	 */
	public List<UpBook> getDataForExcel3(InputStream is){
		
		
		System.out.println("getDataForExcel3 方法执行");
		
		
		return null;
	}
	
	
}
