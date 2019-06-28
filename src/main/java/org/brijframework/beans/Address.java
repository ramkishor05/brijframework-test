package org.brijframework.beans;

import org.brijframework.model.ModelBean;
import org.brijframework.support.beans.Attribute;
import org.brijframework.support.beans.Bean;
import org.brijframework.support.model.Construct;
import org.brijframework.support.model.Logic;
import org.brijframework.support.model.Model;
import org.brijframework.support.model.Param;
import org.brijframework.support.model.Property;
import org.brijframework.support.model.Relation;
import org.brijframework.util.support.Access;

@Model(access = Access.DEFAULT)
@Model(id = "Address_001", access = Access.PRIVATE, constructor= @Construct(params =  {
	@Param(type = String.class, index = 0), 
	@Param(type = String.class, index = 1) 
}))

@Bean(id = "Address_001", model = "Address_001", properties = { 
	@Attribute(name = "line", value = "noida"),
	@Attribute(name = "landMark", value = "Globel")
})
public class Address implements ModelBean {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public Address() {
	}
	
	public Address(String line,String landMark) {
		this.line=line;
		this.landMark=landMark;
	}
	
	@Property(access = Access.PUBLIC, value = "Sector 71")
	public String line;

	@Relation(mappedBy="City")
	private City city;

	@Property(access = Access.PUBLIC, value = "Noida")
	private String landMark;
	
	//public Employee employee;

	@Logic
	public void logicInfo() {
	}

	@Logic
	public void logicInfo(int i) {

	}

	@Logic
	public void logicInfo(String i) {

	}

	@Logic
	public void logicInfo(String i, int j) {

	}

	@Override
	public <T> T setProperty(String _keyPath, T _value) {
		System.out.println("Address ppt call");
		return ModelBean.super.setProperty(_keyPath, _value);
	}
}
