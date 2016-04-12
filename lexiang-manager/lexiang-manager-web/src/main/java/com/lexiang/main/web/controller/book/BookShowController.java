package com.lexiang.main.web.controller.book;

import javax.naming.spi.DirStateFactory.Result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.mapper.orm.UploadBookMapper;
import com.lexiang.main.mapper.po.UpBook;
import com.lexiang.main.pojo.query.BookQuery;
import com.lexiang.main.service.BookShowService;
import com.lexiang.main.service.impl.BookShowServiceImpl;

/**
 * 
 * <p>Title: BookShowController.java</p>
 * <p>Description:图书展示类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年4月12日下午10:04:25
 * @version 1.0
 */
@Controller
@RequestMapping("/book/show")
public class BookShowController {

	private Logger logger  =  LoggerFactory.getLogger(BookShowController.class);
	
	
	@Autowired
	private BookShowService bookShowServiceImpl;
	
	@RequestMapping("/page")
	@ResponseBody
	public ResultData<UpBook>  pageQuery(BookQuery query){
		ResultData<UpBook> result = null;
		try {
			result = bookShowServiceImpl.pageQuery(query);
			
			result.setResult(true);
			
			return result;
			
		} catch (Exception e) {
			logger.error("",e);
		}
		result = new ResultData<UpBook>();
		result.setResult(false);
		return null;
	}
	
}
