package com.mashibing.factorybean;

import com.mashibing.selfeditor.Address;
import org.springframework.beans.factory.FactoryBean;

/**
 * 功能描述：
 *
 * @author liujiayu
 * @version 1.0.0
 * @date 2023-07-05 22:27:00
 */
public class AddressFactoryBean implements FactoryBean<Address> {

	private String addressInfo;

	public String getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}

	@Override
	public Address getObject() throws Exception {
		String[] s = this.addressInfo.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setDistrict(s[2]);
		return address;
	}

	@Override
	public Class<?> getObjectType() {
		return Address.class;
	}
}
