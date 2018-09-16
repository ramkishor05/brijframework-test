package org.brijframework.test;

import org.brijframework.beans.Address;
import org.brijframework.beans.City;
import org.brijframework.beans.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setProperty("address", new Address());
		employee.setProperty("address.line", "noida");
		employee.setProperty("address.city", new City());
		System.err.println(employee);
	}
}
