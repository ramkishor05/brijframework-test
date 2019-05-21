package org.brijframework.beans;

import org.brijframework.support.enums.Scope;
import org.brijframework.support.model.Model;
import org.brijframework.support.model.Property;
import org.brijframework.util.support.Access;

@Model(access = Access.PRIVATE, scope = Scope.SINGLETON)
public class City {

	@Property(value="Auto Noida")
	public String name;
}
