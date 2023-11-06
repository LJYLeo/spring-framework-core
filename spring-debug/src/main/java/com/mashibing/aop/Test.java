package com.mashibing.aop;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 功能描述：
 *
 * @author liujiayu
 * @version 1.0.0
 * @date 2023-11-02 10:11:00
 */
public class Test {

	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/liujiayu/Downloads");
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(MyCalculator.class);
		enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
			System.out.println("enhancer...");
			return methodProxy.invokeSuper(o, objects);
		});
		MyCalculator myCalculator = (MyCalculator) enhancer.create();
		myCalculator.add();
	}

}
