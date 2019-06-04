package org.brijframework.test.model;

import java.io.IOException;

import org.brijframework.model.builder.ModelBuilder;

public class ModelBuilderForTestObject {

	public static void main(String[] args) throws IOException {
		
		ModelBuilder builder=ModelBuilder.getBuilder("Employee");
		builder.setProperty("name", "ram");
		builder.setProperty("rollNo", "10");
		builder.setProperty("address.line", "noida");
		builder.setProperty("address.city.name", "Gr Noida");
		builder.printObject();
	}
}
