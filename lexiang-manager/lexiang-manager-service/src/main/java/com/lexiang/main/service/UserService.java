package com.lexiang.main.service;

import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.pojo.po.User;
/**
 * 
 * <p>Title: UserService.java</p>
 * <p>Description: 用户操作业务层</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月14日下午10:47:59
 * @version 1.0
 */
public interface UserService {
	/**
	 * 
	 * <p>Title: addUser</p>
	 * <p>Description:添加用户 </p>
	 * @param user 用户
	 * @return
	 */
	public ResultData<String> addUser(User user);
	
}
