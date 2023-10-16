package com.mashibing;

import com.mashibing.selfeditor.Address;

/**
 * 功能描述：
 *
 * @author liujiayu
 * @version 1.0.0
 * @date 2023-06-02 02:13:00
 */
public class Test {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("test.xml");
//		Address address = context.getBean(Address.class);
//		System.out.println(address);
	}

}
