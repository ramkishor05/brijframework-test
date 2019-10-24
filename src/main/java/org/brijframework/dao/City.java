package org.brijframework.dao;

import org.brijframework.support.model.Model;
import org.brijframework.support.model.Property;
import org.brijframework.util.support.Access;

@Model(access = Access.PRIVATE)
public class City {

	@Property(value="Auto Noida")
	public String name;
}
