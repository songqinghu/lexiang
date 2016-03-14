package com.lexiang.main.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.mapper.orm.UserMapper;
import com.lexiang.main.pojo.po.User;
import com.lexiang.main.service.UserService;

@Service("userServiceImpl")
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
		int userId = userMapper.insertUser(user);
		System.out.println(userId);
		ResultData<String> result = new ResultData<String>();
		result.setMateData(userId+"");
		return result;
	}

}