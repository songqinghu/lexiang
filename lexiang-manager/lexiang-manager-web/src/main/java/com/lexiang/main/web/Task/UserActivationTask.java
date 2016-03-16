package com.lexiang.main.web.Task;

import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * <p>Title: UserActivationTask.java</p>
 * <p>Description: 用户激活定时任务</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月14日下午11:02:24
 * @version 1.0
 */
public class UserActivationTask {

	/**
	 * 
	 * <p>Title: method</p>
	 * <p>Description:定时执行的方法 </p>
	 */
    @Value("${jdbc.driver}")
    private String driver;
    
    private long time=1;
    
	public void  method(){
	    long start = System.currentTimeMillis();
		System.out.println("定时任务执行  时间:"+(time-start)+"  driver: "+driver);
		time = start;
	}
}
