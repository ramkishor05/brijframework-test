package org.brijframework.test.model;

import org.brijframework.dao.Address;
import org.brijframework.dao.Employee;

public class ModelBeanForTestObject {

	public static void main(String[] args) {

		Employee employee=new Employee();
		employee.setProperty("address", new Address());
		employee.setProperty("id", "01010");
		employee.setProperty("name", "Ram");
		employee.setProperty("address.line", "Noida1");
		//employee.setProperty("addresseMap.address010.city", new City());
		employee.setProperty("address.city.name", "Ok1");
		employee.printObject();
		
		System.out.println(employee.typeOfProperty("address"));
	}

}
