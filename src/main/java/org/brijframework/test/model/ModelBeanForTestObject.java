package org.brijframework.test.model;

import org.brijframework.beans.Address;
import org.brijframework.beans.Employee;

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
