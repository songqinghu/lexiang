package com.lexiang.main.service;

import java.util.List;

import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.mapper.po.UpBook;

public interface BookUploadService {

	public ResultData<Boolean> addBooks(List<UpBook> books);
	
	public ResultData<Boolean> updateBook(UpBook book);
	
	public UpBook findOneById(long bookId);
	
	
}
