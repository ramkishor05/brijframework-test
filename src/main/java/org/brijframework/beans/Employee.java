package org.brijframework.beans;

import java.util.Set;

import org.brijframework.model.GenericModel;
import org.brijframework.support.enums.Access;
import org.brijframework.support.enums.Formula;
import org.brijframework.support.enums.Scope;
import org.brijframework.support.enums.Wiring;
import org.brijframework.support.model.Construct;
import org.brijframework.support.model.Identity;
import org.brijframework.support.model.Logic;
import org.brijframework.support.model.Mapping;
import org.brijframework.support.model.Model;
import org.brijframework.support.model.Param;
import org.brijframework.support.model.Property;
import org.brijframework.support.model.Relation;
import org.brijframework.support.model.Strategy;

@Model(id = "Employee_001", access = Access.PRIVATE,
   scope = Scope.PROTOTYPE, extend = "", propertyKeys = { "id","name" }, 
   methodKeys = { "id", "name" }
)
@Model(access = Access.PUBLIC, scope = Scope.SINGLETON, 
   constructor= @Construct(params =  {
		@Param(type =long.class, value = "1", index = 2),
		@Param(type = String.class, value = "1", index = 0), 
		@Param(type = String.class, value = "Ram", index = 1) 
}))
public class Employee implements GenericModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Property("1")
	@Identity(strategy = @Strategy(formula = Formula.Sequence, init = 10))
	public String id;
	

	@Property(access = Access.PUBLIC, required=true)
	private String name;
	
	@Property(access = Access.PUBLIC, required=true)
	private long rollNo;
	
	@Relation(mappedBy="Address_001", wired=Wiring.AUTO, access=Access.PUBLIC, required=true)
	public Address address;
	
	@Mapping(source = "" )
	public Set<Address> addresses;
	

	public Employee() {
	}

	@Construct(params = { @Param(type = String.class, value = "1", index = 0) })
	public Employee(String id) {
		this.id = id;
	}
	
	@Construct(params = { @Param(type = String.class, value = "1", index = 0), @Param(type = String.class, value = "Ram", index = 1) })
	public Employee(String id,String name) {
		this.id = id;
		this.name=name;
	}
	
	@Construct(params = { @Param(type = String.class, value = "1", index = 0), @Param(type = String.class, value = "Ram", index = 1) })
	public Employee(String id,String name,long rollNo) {
		this.id = id;
		this.name=name;
		this.rollNo=rollNo;
	}
	
	@Property("1")
	public void setId(String id) {
		this.id = id;
	}
	
	@Property("1")
	public String getId() {
		return id;
	}

	@Logic
	public void logicInfo() {
	}

	@Logic
	public void logicInfo(int i) {
	}

	@Logic
	public void logicInfo(String i) {
	}
	

	@Logic(id="nameForKey",access=Access.DEFAULT)
	public void logicInfo(@Param(value="Ram",index=0,name="first", type = String.class)String i,@Param(value="1", index=1, type=Integer.class) Number j) {
	}
	
	@Logic
	public void logicInfo(@Param(value="Ram",index=0, type = String.class)String i,@Param(value="1", index=1, type=String.class) String j) {
	}
	
	@Override
	public <T> T setProperty(String _keyPath, T _value) {
		return GenericModel.super.setProperty(_keyPath, _value);
	}
	
}
