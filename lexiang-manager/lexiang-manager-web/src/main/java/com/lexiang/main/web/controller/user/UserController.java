package com.lexiang.main.web.controller.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	/**
	 * 
	 * <p>Title: addUser</p>
	 * <p>Description: </p>
	 * @param user 用户注册必须信息封装
	 * @param request 原始潜在信息收集
	 * @param checkCode 验证码
	 * @return 成功跳转到提示邮箱校验页面 失败进入统一失败页面处理
	 */
	@RequestMapping("/addUser")
	public String  addUser(User user,HttpServletRequest request,String checkCode){
		
		ResultData<String> result ;
		System.out.println(checkCode);
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
