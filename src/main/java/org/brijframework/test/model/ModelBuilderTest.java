package org.brijframework.test.model;

import java.io.IOException;

import org.brijframework.model.builder.ModelBuilder;
import org.brijframework.model.context.ModelContext;
import org.brijframework.util.printer.GraphPrinter;

public class ModelBuilderTest {

	public static void main(String[] args) throws IOException {
		
		ModelContext context=new ModelContext();
		context.startup();
		
		ModelBuilder builder=ModelBuilder.getBuilder("Employee");
		builder.setProperty("name", "r");
		builder.setProperty("rollNo", "10");
		/*
		 * builder.setProperty("address.line", "noida");
		 * builder.setProperty("address.city.name", "Gr Noida");
		 */
		System.out.println(GraphPrinter.getPrinter(builder.getInstance()).printObject());
		
		
	}
}
