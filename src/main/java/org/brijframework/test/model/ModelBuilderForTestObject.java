package org.brijframework.test.model;

import java.io.IOException;

import org.brijframework.beans.Employee;
import org.brijframework.model.builder.ModelBuilder;

public class ModelBuilderForTestObject {

	public static void main(String[] args) throws IOException {
		
		ModelBuilder builder=ModelBuilder.getBuilder(Employee.class);
		builder.setProperties("name~rollNo~address.line", "ram","10","noida");
		System.out.println(builder.getProperties());
		builder.printObject();
	}
}
