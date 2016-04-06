package com.lexiang.main.mapper.orm;

import com.lexiang.main.pojo.po.User;

/**
 * 
 * <p>Title: UserMapper.java</p>
 * <p>Description: 用户信息封装接口</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月14日下午10:08:37
 * @version 1.0
 */
public interface UserMapper {

	
	public int insertUser(User user);

	/**
	 * 
	 * <p>Title: findUsernameByKey</p>
	 * <p>Description:试试看 </p>
	 * @param username
	 * @return
	 */
	public int findUsernameByKey(String username);

	public int findEmailByKey(String email);
	
	
}
