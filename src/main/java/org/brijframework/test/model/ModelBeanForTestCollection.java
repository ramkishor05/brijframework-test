package org.brijframework.test.model;

import org.brijframework.beans.Employee;

/**
 * Hello world!
 *
 */
public class ModelBeanForTestCollection {
	public static void main(String[] args) {
		Employee employee=new Employee();
		/*List<Address>addresses=new ArrayList<Address>();
		employee.setProperty("addresses", addresses);*/
		//employee.setProperty("addresses[0]", new Address());
		employee.setProperty("addresses[0].line", "Noida1");
		//employee.setProperty("addresseMap.address010.city", new City());
		//System.out.println(""+employee.getProperty("addresses").getClass());
		
		employee.setProperty("addresses[1].line", "Noida2");
		employee.setProperty("addresses[1].city.name", "Ok2");
		employee.setProperty("addresses[1].city.name", "Ok2up");
		
		employee.setProperty("address.city.name","DB");
		employee.printObject();
	}
}
