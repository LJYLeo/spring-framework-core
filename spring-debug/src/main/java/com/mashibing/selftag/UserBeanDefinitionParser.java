package com.mashibing.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 功能描述：
 *
 * @author liujiayu
 * @version 1.0.0
 * @date 2023-06-08 00:05:00
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String username = element.getAttribute("username");
		String email = element.getAttribute("email");
		String password = element.getAttribute("password");

		if (StringUtils.hasText(username)) {
			builder.addPropertyValue("username", username);
		}
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
		if (StringUtils.hasText(password)) {
			builder.addPropertyValue("password", password);
		}
	}
}
