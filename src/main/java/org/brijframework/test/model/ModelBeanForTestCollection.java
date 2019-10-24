package org.brijframework.test.model;

import org.brijframework.dao.Employee;

/**
 * Hello world!
 *
 */
public class ModelBeanForTestCollection {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setProperty("addresses[0].line", "Noida1");
		employee.setProperty("addresses[0].city.name", "Ok1");
		
		employee.setProperty("addresses[1].line", "Noida2");
		employee.setProperty("addresses[1].city.name", "Ok2");
		
		Object address1=employee.getProperty("addresses[0]");
		Object line1=employee.getProperty("addresses[0].line");
		Object city1=employee.getProperty("addresses[0].city");
		Object cityname1=employee.getProperty("addresses[0].city.name");
		
		Object address2=employee.getProperty("addresses[1]");
		Object line2=employee.getProperty("addresses[1].line");
		Object city2=employee.getProperty("addresses[1].city");
		Object cityname2=employee.getProperty("addresses[1].city.name");
		
		System.out.println("address="+address1);
		System.out.println("line1="+line1);
		System.out.println("city="+city1);
		System.out.println("cityname1="+cityname1);
		
		System.out.println("address2="+address2);
		System.out.println("line2="+line2);
		System.out.println("city2="+city2);
		System.out.println("cityname2="+cityname2);
		
		
	}
}
