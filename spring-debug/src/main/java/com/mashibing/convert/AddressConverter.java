package com.mashibing.convert;

import com.mashibing.selfeditor.Address;
import org.springframework.core.convert.converter.Converter;

/**
 * 功能描述：
 *
 * @author liujiayu
 * @version 1.0.0
 * @date 2023-07-05 22:04:00
 */
public class AddressConverter implements Converter<String, Address> {
	@Override
	public Address convert(String source) {
		String[] s = source.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setDistrict(s[2]);
		return address;
	}
}
