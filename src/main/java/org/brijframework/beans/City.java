package org.brijframework.beans;

import org.brijframework.support.enums.Access;
import org.brijframework.support.enums.Scope;
import org.brijframework.support.model.Identity;
import org.brijframework.support.model.Model;

@Model(access = Access.DEFAULT, scope = Scope.prototype)
public class City {

	@Identity
	public String id;
}
