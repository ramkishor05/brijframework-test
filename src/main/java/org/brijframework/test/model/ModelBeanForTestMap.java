package org.brijframework.test.model;

import java.util.HashMap;

import org.brijframework.beans.Address;
import org.brijframework.beans.Employee;
import org.brijframework.model.context.ModelContext;

/**
 * Hello world!
 *
 */
public class ModelBeanForTestMap {
	public static void main(String[] args) {
		ModelContext context=new ModelContext();
		context.startup();
		Employee employee=new Employee();
		employee.setProperty("addresseMap", new HashMap<Integer, Address>());
		employee.setProperty("addresseMap.01010", new Address());
		employee.setProperty("addresseMap.01010.line", "Noida1");
		//employee.setProperty("addresseMap.address010.city", new City());
		employee.setProperty("addresseMap.01010.city.name", "Ok1");
		System.out.println(""+employee.getProperty("addresseMap").getClass());
		//employee.setProperty("addresseMap.address012", new Address());
		employee.setProperty("addresseMap.1212.line", "Noida2");
		//employee.setProperty("addresseMap.address012.city", new City());
		employee.setProperty("addresseMap.1212.city.name", "Ok2");
		employee.printObject();
	}
}
