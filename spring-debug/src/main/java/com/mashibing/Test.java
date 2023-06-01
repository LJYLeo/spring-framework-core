package com.mashibing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @author liujiayu
 * @version 1.0.0
 * @date 2023-06-02 02:13:00
 */
public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		Student bean = context.getBean(Student.class);
		System.out.println(bean);
		context.close();
	}

}
