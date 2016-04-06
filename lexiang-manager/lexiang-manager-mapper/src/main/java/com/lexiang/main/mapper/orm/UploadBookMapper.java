package com.lexiang.main.mapper.orm;

import com.lexiang.main.mapper.po.UpBook;

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
	
}
