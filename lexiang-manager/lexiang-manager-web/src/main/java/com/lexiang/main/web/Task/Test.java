package com.lexiang.main.web.Task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext parentContext = new ClassPathXmlApplicationContext("spring/spring1.xml");
		ClassPathXmlApplicationContext childContext = new ClassPathXmlApplicationContext();
		childContext.setParent(parentContext);
		childContext.setConfigLocation("spring/spring2.xml");
		childContext.refresh();
		//UserActivationTask bean1 = parentContext.getBean(com.lexiang.main.web.Task.UserActivationTask.class);
		UserActivationTask bean1 = (UserActivationTask) parentContext.getBean("task");
		//UserActivationTask bean2 = childContext.getBean(com.lexiang.main.web.Task.UserActivationTask.class);
		UserActivationTask bean2 = (UserActivationTask) childContext.getBean("task");
		System.out.println(bean1 == bean2);
	}
}
