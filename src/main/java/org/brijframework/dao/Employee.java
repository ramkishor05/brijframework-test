package org.brijframework.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.brijframework.Access;
import org.brijframework.bean.BeanObject;
import org.brijframework.support.enums.Formula;
import org.brijframework.support.model.ModelConstruct;
import org.brijframework.support.model.Model;
import org.brijframework.support.model.identifier.Identity;
import org.brijframework.support.model.identifier.Strategy;
import org.brijframework.support.model.logics.Logic;
import org.brijframework.support.model.properties.ModelProperty;
import org.brijframework.support.model.properties.ModelRelation;
import org.brijframework.support.model.queries.Param;
import org.brijframework.util.support.ReflectionAccess;

@Model(id = "Employee_001", access = Access.AUTO)
@Model(access = Access.AUTO, constructor = @ModelConstruct(params = {
		@Param(type = long.class, value = "1", index = 2), @Param(type = String.class, value = "1", index = 0),
		@Param(type = String.class, value = "Ram", index = 1) }))
public class Employee implements BeanObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ModelProperty("1")
	@Identity(strategy = @Strategy(formula = Formula.Sequence, init = 10))
	private String id;

	@ModelProperty(access = Access.AUTO, required = true)
	private String name;

	@ModelProperty(access = Access.AUTO, required = true)
	private long rollNo;

	@ModelRelation(mappedBy = "Address_001", access = Access.AUTO, required = true)
	private Address address;

	@ModelRelation(access = Access.AUTO, required = true)
	private List<Address> addresses;

	@ModelProperty(access = Access.AUTO, required = true, type = LinkedHashMap.class)
	private Map<Integer, Address> addresseMap;

	public Employee() {
		System.out.println("colling for default");
	}

	@ModelConstruct(params = { @Param(type = String.class, value = "1", index = 0) })
	public Employee(String id) {
		System.out.println("colling for String only ");
		this.id = id;
	}

	@ModelConstruct(params = { @Param(type = String.class, value = "1", index = 0),
			@Param(type = String.class, value = "Ram", index = 1) })
	public Employee(String id, String name) {
		System.out.println("colling for id and name ");
		this.id = id;
		this.name = name;
	}

	@ModelConstruct(params = { @Param(type = String.class, value = "1", index = 0),
			@Param(type = String.class, value = "Ram", index = 1), @Param(type = Long.class, value = "1", index = 2) })
	public Employee(String id, String name, long rollNo) {
		System.out.println("colling for id and name, rollno ");
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}

	@ModelProperty("1")
	public void setId(String id) {
		this.id = id;
	}

	@ModelProperty("1")
	public String getId() {
		System.out.println("id is getting :" + id);
		return id;
	}

	@Logic
	public void logicInfo() {
		System.out.println("colled");
	}

	@Logic
	public void logicInfo(int i) {
		System.out.println("int i=" + i);
	}

	@Logic
	public void logicInfo(String i) {
		System.out.println("String i=" + i);
	}

	@Logic(id = "nameForKey")
	public void logicInfo(@Param(value = "Ram", index = 0, name = "first", type = String.class) String i,
			@Param(value = "1", index = 1, type = Integer.class) Number j) {
		System.out.println("String i=" + i);
		System.out.println("int j=" + j);
	}

	@Logic
	public void logicInfo(@Param(value = "Ram", index = 0, type = String.class) String i,
			@Param(value = "1", index = 1, type = String.class) String j) {
		System.out.println("String j=" + j);
	}

	@Override
	public String toString() {
		return super.toString()+"[id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", address=" + address + ", addresses="
				+ addresses + ", addresseMap=" + addresseMap + "]";
	}
	
	

}
