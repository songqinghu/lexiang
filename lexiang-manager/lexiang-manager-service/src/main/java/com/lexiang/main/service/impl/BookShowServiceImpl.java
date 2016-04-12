package com.lexiang.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.mapper.orm.UploadBookMapper;
import com.lexiang.main.mapper.po.UpBook;
import com.lexiang.main.pojo.query.BookQuery;
import com.lexiang.main.service.BookShowService;

@Service
public class BookShowServiceImpl implements BookShowService {

	@Autowired
	private UploadBookMapper  bookMapper;
	
	@Override
	public ResultData<UpBook> pageQuery(BookQuery query) {
		
		List<UpBook> list = bookMapper.findList(query);
		
		ResultData<UpBook> result = new ResultData<UpBook>();
		
		result.setData(list);
		
		return result;
	}

	
	
}
