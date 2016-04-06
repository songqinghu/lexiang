package com.lexiang.main.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.lexiang.main.common.utils.LoggerUtils;
import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.mapper.orm.UploadBookMapper;
import com.lexiang.main.mapper.po.UpBook;
import com.lexiang.main.service.BookUploadService;

/**
 * 
 * <p>Title: BookUploadServiceImpl.java</p>
 * <p>Description:excel读取文件到数据库 </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月31日下午11:47:12
 * @version 1.0
 */
@Service
public class BookUploadServiceImpl implements BookUploadService {

	@Resource
	private UploadBookMapper  uploadBookMapper;
	
	@Override
	public ResultData<Boolean> addBooks(List<UpBook> books) {
		 ResultData<Boolean> result = new ResultData<Boolean>();
		try {
			for (UpBook upBook : books) {
				if(StringUtils.isNotBlank(upBook.getBookname()) 
						&& StringUtils.isNotBlank(upBook.getUrlpath())&&
						StringUtils.isNotBlank(upBook.getPassword())){//书籍名称  下载地址 密码是必须的
					if (!StringUtils.isNotBlank(upBook.getAuthor())) {
						upBook.setAuthor("未知");
					}
					if (!StringUtils.isNotBlank(upBook.getBooktype())) {
						upBook.setBooktype("未知");
					}
					upBook.setStatus("1");//可使用
					
					//book设置完毕--插入数据库
					int id = uploadBookMapper.addBook(upBook);
					LoggerUtils.getLogger().info("插入图书编号:{},成功!",id);
				}
			}
			result.setMateData(true);
		} catch (Exception e) {
			LoggerUtils.getLogger().error("",e);
			result.setMateData(false);
		}
		return result;
	}

	/*
	 * 更新图书信息
	 */
	@Override
	public ResultData<Boolean> updateBook(UpBook book) {
		ResultData<Boolean> result = new ResultData<Boolean>();
		
		UpBook book_mysql = findOneById(book.getBookId());
		
		if(book.getAuthor()==null){
		   book.setAuthor(book_mysql.getAuthor());
		}
		if(book.getBookname() ==null){
		   book.setBookname(book_mysql.getBookname());
		}
		if(book.getBooktype() == null){
			book.setBooktype(book_mysql.getBooktype());
		}
		if(book.getPassword() == null){
			book.setPassword(book_mysql.getPassword());
		}
		if(book.getStatus() == null){
			book.setStatus(book_mysql.getStatus());
		}
		if(book.getUrlpath() == null){
			book.setUrlpath(book_mysql.getUrlpath());
		}
	     int code = uploadBookMapper.updateBook(book);
	      if(code >0){
				result.setMateData(true);
				return result;
			}

		result.setMateData(false);
		return result;
	}

	@Override
	public UpBook findOneById(long bookId) {
		
		if(bookId > 0){
			UpBook book = uploadBookMapper.findOneById(bookId);
			if(book !=null) return book;
		}
		return null;
	}

	
	
	
}
