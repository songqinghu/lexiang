package com.lexiang.main.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.mapper.orm.UserMapper;
import com.lexiang.main.pojo.po.User;
import com.lexiang.main.service.UserService;

@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private  UserMapper userMapper;
	
	/**
	 * 
	 * <p>Title: addUser</p>
	 * <p>Description:添加用户 发送校验邮件 定时任务检查未激活的用户发送激活邮件 </p>
	 * @param user
	 * @return
	 * @see com.lexiang.main.service.UserService#addUser(com.lexiang.main.pojo.po.User)
	 */
	@Override
	public ResultData<String> addUser(User user) {
		
		user.setCreateDate(new Date());
		user.setUpdateDate(new Date());
		user.setStatus(0+"");
		userMapper.insertUser(user);
		long userId= user.getUserId();
		System.out.println(userId);
		ResultData<String> result = new ResultData<String>();
		result.setMateData(userId+"");
		return result;
	}
	
	/**
	 * 
	 * <p>Title: findUsernameByKey</p>
	 * <p>Description:根据用户名查找数据库 </p>
	 * @param username
	 * @return
	 * @see com.lexiang.main.service.UserService#findUsernameByKey(java.lang.String)
	 */
	@Override
	public boolean findUsernameByKey(String username) {
		
		int result = userMapper.findUsernameByKey(username);
		
		return result == 0 ? true: false;
	}

	/**
	 * 
	 * <p>Title: findEmailByKey</p>
	 * <p>Description:根据email查询数据库 </p>
	 * @param email
	 * @return
	 * @see com.lexiang.main.service.UserService#findEmailByKey(java.lang.String)
	 */
	@Override
	public boolean findEmailByKey(String email) {
		
		int result = userMapper.findEmailByKey(email);
		
		return result == 0 ? true: false;
	}

	
	
	
	
}
