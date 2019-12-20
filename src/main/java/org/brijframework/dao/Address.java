package org.brijframework.dao;

import org.brijframework.Access;
import org.brijframework.bean.BeanObject;
import org.brijframework.support.bean.Bean;
import org.brijframework.support.bean.BeanConstruct;
import org.brijframework.support.bean.BeanParam;
import org.brijframework.support.bean.properties.BeanProperty;
import org.brijframework.support.enums.Scope;
import org.brijframework.support.model.Model;
import org.brijframework.support.model.ModelConstruct;
import org.brijframework.support.model.ModelParam;
import org.brijframework.support.model.logics.Logic;
import org.brijframework.support.model.mapper.ModelMapper;
import org.brijframework.support.model.properties.ModelProperty;
import org.brijframework.support.model.properties.ModelRelation;

@Model(
	id = "Address_001", 
	access = Access.AUTO, 
	constructor = @ModelConstruct(
		params = {
			@ModelParam(type = String.class, index = 0), 
			@ModelParam(type = String.class, index = 1) 
			}
		)
	, 
	properties = {
		@ModelProperty(name = "line"), 
		@ModelProperty(name = "landMark") 
	}
)
@Bean(
	id = "Address_001", 
	scope=Scope.PROTOTYPE, 
	model = "Address_001", 
	constructor = @BeanConstruct(
		params = {
			@BeanParam(index = 0, value="line"),
			@BeanParam(index = 1, value="landMark")
		}
	), 
	properties = {
		@BeanProperty(name = "line", value = "noida"), 
		@BeanProperty(name = "landMark", value = "Globel") 
	}
)
@Model
@Bean(scope=Scope.SESSION)
@ModelMapper(source = "")
public class Address implements BeanObject {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	public Address() {
	}

	public Address(String line, String landMark) {
		this.line = line;
		this.landMark = landMark;
		System.out.println(line+" = = "+landMark);
	}

	@ModelProperty(access = Access.READ_WRITE)
	@BeanProperty("Sector 71")
	public String line;

	@ModelRelation(mappedBy = "City",access = Access.READ_ONLY)
	private City city;

	@ModelMapper(source = "LANDMARK", destination="landMark")
	@ModelProperty(access = Access.WRITE_ONLY)
	private String landMark;
	
	@ModelProperty(access = Access.AUTO)
	private Employee employee;

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
		return BeanObject.super.setProperty(_keyPath, _value);
	}

	@Override
	public String toString() {
		return super.toString()+"[line=" + line + ", city=" + city + ", landMark=" + landMark + "]";
	}
	
	
}
