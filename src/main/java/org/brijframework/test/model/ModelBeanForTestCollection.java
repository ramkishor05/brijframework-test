package org.brijframework.test.model;

import org.brijframework.beans.Employee;

/**
 * Hello world!
 *
 */
public class ModelBeanForTestCollection {
	public static void main(String[] args) {
		Employee employee=new Employee();
		//employee.setProperty("addresses", new ArrayList<Address>());
		//employee.setProperty("addresses[0]", new Address());
		employee.setProperty("addresses[0].line", "Noida1");
		//employee.setProperty("addresseMap.address010.city", new City());
		employee.setProperty("addresses[0].city.name", "Ok1");
		System.out.println(""+employee.getProperty("addresses").getClass());
		employee.printObject();
	}
}
