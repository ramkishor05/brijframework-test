package org.brijframework.test.model;

import org.brijframework.boot.factories.BootstrapContextFactory;
import org.brijframework.dao.Address;
import org.brijframework.dao.Employee;

/**
 * Hello world!
 *
 */
public class ModelBeanForTestMap {
	public static void main(String[] args) {
		BootstrapContextFactory.getFactory().getApplicationContext();
		Employee employee=new Employee();
		employee.setProperty("addresseMap.01010", new Address());
		employee.setProperty("addresseMap.01010.line", "Noida1");
		employee.setProperty("addresseMap.01010.city.name", "Ok1");
		employee.setProperty("addresseMap.1212.line", "Noida2");
		employee.setProperty("addresseMap.1212.city.name", "Ok2");
		employee.printObject();
	}
}
