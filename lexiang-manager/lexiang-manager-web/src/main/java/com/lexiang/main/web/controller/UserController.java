package com.lexiang.main.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.lexiang.main.common.utils.ResultData;
import com.lexiang.main.pojo.po.User;
import com.lexiang.main.service.UserService;
import com.lexiang.main.service.impl.UserServiceImpl;

/**
 * 
 * <p>Title: UserController.java</p>
 * <p>Description:用户相关功能接口 </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月14日下午11:04:28
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userServiceImpl;
	
	
	@RequestMapping("/addUser")
	public String  addUser(User user,HttpServletRequest request){
		
		ResultData<String> result ;
		//用户信息输入信息
		if(user!=null){
			if(StringUtils.isNotBlank(user.getUsername())&&
			   StringUtils.isNotBlank(user.getPassword())&&
			   StringUtils.isNotBlank(user.getEmail())){
				result = userServiceImpl.addUser(user);
				return "success";
			}
		}
		
		//潜在信息挖掘
		
		return "error";
	}
	
	
	
	
}
