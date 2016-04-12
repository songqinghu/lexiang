package com.lexiang.main.mapper.orm;

import java.util.List;

import com.lexiang.main.mapper.po.UpBook;
import com.lexiang.main.pojo.query.BookQuery;

/**
 * 
 * <p>Title: UploadBookMapper.java</p>
 * <p>Description: 图书上传dao</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年4月1日上午12:00:31
 * @version 1.0
 */
public interface UploadBookMapper {

	
	public int addBook(UpBook book);
	
	public int updateBook(UpBook book);
	
	public UpBook findOneById(long bookId);
	
	
	public List<UpBook> findList(BookQuery query);
	
}
