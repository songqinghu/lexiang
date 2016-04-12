package com.lexiang.main.service;

import com.lexiang.main.common.utils.ResultData;
/**
 * 
 * <p>Title: BookShowService.java</p>
 * <p>Description:业务层 </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年4月12日下午10:35:56
 * @version 1.0
 */
import com.lexiang.main.mapper.po.UpBook;
import com.lexiang.main.pojo.query.BookQuery;
public interface BookShowService {

	
	
	
	public ResultData<UpBook> pageQuery(BookQuery query);
	
}
