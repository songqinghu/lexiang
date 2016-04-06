package com.lexiang.main.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * <p>Title: LoggerUtils.java</p>
 * <p>Description: 日志工具类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月31日下午11:42:13
 * @version 1.0
 */
public class LoggerUtils {

	private static Logger  logger  = LoggerFactory.getLogger(LoggerUtils.class);
	
	public static Logger getLogger(){
		return logger;
	}
}
