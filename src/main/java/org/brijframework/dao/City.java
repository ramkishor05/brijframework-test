package org.brijframework.dao;

import org.brijframework.Access;
import org.brijframework.support.model.Model;
import org.brijframework.support.model.properties.ModelProperty;

@Model(access = Access.AUTO)
public class City {

	@ModelProperty(value="Auto Noida")
	public String name;
}
