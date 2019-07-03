package org.brijframework.test.model;

import java.io.IOException;

import org.brijframework.bean.impl.BeanBuilder;
import org.brijframework.beans.Employee;

public class ModelBuilderForTestObject {

	public static void main(String[] args) throws IOException {
		
		BeanBuilder builder=BeanBuilder.getBuilder(Employee.class);
		builder.setProperties("name~rollNo~address.line", "ram","10","noida");
		System.out.println(builder.getProperties());
		builder.printObject();
	}
}
