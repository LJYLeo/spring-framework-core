package com.mashibing.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 功能描述：
 *
 * @author liujiayu
 * @version 1.0.0
 * @date 2023-06-08 00:15:00
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
