package org.brijframework.test.model;

import org.brijframework.beans.Employee;

/**
 * Hello world!
 *
 */
public class ModelBeanForTestMap {
	public static void main(String[] args) {
		Employee employee=new Employee();
		//employee.setProperty("addresseMap", new HashMap<String, Address>());
		//employee.setProperty("addresseMap.address010", new Address());
		employee.setProperty("addresseMap.address010.line", "Noida1");
		//employee.setProperty("addresseMap.address010.city", new City());
		employee.setProperty("addresseMap.address010.city.name", "Ok1");
		System.out.println(""+employee.getProperty("addresseMap").getClass());
		//employee.setProperty("addresseMap.address012", new Address());
		employee.setProperty("addresseMap.address012.line", "Noida2");
		//employee.setProperty("addresseMap.address012.city", new City());
		employee.setProperty("addresseMap.address012.city.name", "Ok2");
		employee.printObject();
	}
}
