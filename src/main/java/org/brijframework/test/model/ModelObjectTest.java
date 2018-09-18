package org.brijframework.test.model;

import org.brijframework.beans.Address;
import org.brijframework.beans.City;
import org.brijframework.beans.Employee;

/**
 * Hello world!
 *
 */
public class ModelObjectTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setProperty("address", new Address());
		employee.setProperty("address.line", "noida");
		employee.setProperty("address.city", new City());
		
		System.out.println(employee.containsKey("address.city"));
		System.out.println(employee.containsValue("address.city"));
	}
}
