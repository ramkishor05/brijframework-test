package org.brijframework.beans;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.brijframework.model.ModelBean;
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
import org.brijframework.util.support.Access;

@Model(id = "Employee_REQUEST", access = Access.PRIVATE,
   scope = Scope.REQUEST
)
@Model(id = "Employee_PROTOTYPE", access = Access.PRIVATE,
scope = Scope.PROTOTYPE
)
@Model(id = "Employee_SINGLETON", access = Access.PRIVATE,
scope = Scope.SINGLETON
)
@Model(access = Access.PUBLIC, scope = Scope.SESSION, 
   constructor= @Construct(params =  {
		@Param(type =long.class, value = "1", index = 2),
		@Param(type = String.class, value = "1", index = 0), 
		@Param(type = String.class, value = "Ram", index = 1) 
}))
public class Employee implements ModelBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Property("1")
	@Identity(strategy = @Strategy(formula = Formula.Sequence, init = 10))
	private String id;
	

	@Property(access = Access.PUBLIC, required=true)
	private String name;
	
	@Property(access = Access.PUBLIC, required=true)
	private long rollNo;
	
	@Relation(mappedBy="Address_001", wired=Wiring.AUTO, access=Access.PUBLIC, required=true)
	private Address address;
	
	@Mapping(source = "AddressList" )
	private List<Address> addresses;
	
	@Property(access = Access.PUBLIC, required=true, type=LinkedHashMap.class)
	private Map<Integer,Address> addresseMap;

	public Employee() {
		System.out.println("colling for default");
	}

	@Construct(params = { @Param(type = String.class, value = "1", index = 0) })
	public Employee(String id) {
		System.out.println("colling for String only ");
		this.id = id;
	}
	
	@Construct(params = { @Param(type = String.class, value = "1", index = 0), @Param(type = String.class, value = "Ram", index = 1) })
	public Employee(String id,String name) {
		System.out.println("colling for id and name ");
		this.id = id;
		this.name=name;
	}
	
	@Construct(params = { @Param(type = String.class, value = "1", index = 0), @Param(type = String.class, value = "Ram", index = 1),@Param(type = Long.class, value = "1", index = 2) })
	public Employee(String id,String name,long rollNo) {
		System.out.println("colling for id and name, rollno ");
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
		System.out.println("id is getting :"+id);
		return id;
	}

	@Logic
	public void logicInfo() {
		System.out.println("colled");
	}

	@Logic
	public void logicInfo(int i) {
      System.out.println("int i="+i);
	}

	@Logic
	public void logicInfo(String i) {
		System.out.println("String i="+i);
	}
	

	@Logic(id="nameForKey",access=Access.DEFAULT)
	public void logicInfo(@Param(value="Ram",index=0,name="first", type = String.class)String i,@Param(value="1", index=1, type=Integer.class) Number j) {
		System.out.println("String i="+i);
		System.out.println("int j="+j);
	}
	
	@Logic
	public void logicInfo(@Param(value="Ram",index=0, type = String.class)String i,@Param(value="1", index=1, type=String.class) String j) {
		System.out.println("String j="+j);
	}
	
}
