package com.mashibing.populatebean;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * 功能描述：
 *
 * @author liujiayu
 * @version 1.0.0
 * @date 2023-10-26 16:23:00
 */
public class Person {

	@Autowired
	private Map<String,Object> maps;

	public Map<String, Object> getMaps() {
		return maps;
	}
}
