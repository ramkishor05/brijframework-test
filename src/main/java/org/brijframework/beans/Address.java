package org.brijframework.beans;

import org.brijframework.md.BaseObjectImpl;
import org.brijframework.support.enums.Access;
import org.brijframework.support.enums.Scope;
import org.brijframework.support.model.Logic;
import org.brijframework.support.model.Model;
import org.brijframework.support.model.Property;
import org.brijframework.support.model.Relation;

@Model(access = Access.DEFAULT, scope = Scope.prototype)
@Model(id = "Address_001", access = Access.DEFAULT, scope = Scope.prototype)
public class Address extends BaseObjectImpl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Property(access = Access.PUBLIC, value = "Noida")
	public String line;

	@Relation(value="city",  mappedBy="")
	public City city;

	@Property(access = Access.PUBLIC, value = "Noida")
	private String landMark;
	
	@Relation("Employee")
	public Employee employee;

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

}
