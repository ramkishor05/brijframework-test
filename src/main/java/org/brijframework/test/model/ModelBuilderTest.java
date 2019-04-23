package org.brijframework.test.model;

import java.io.IOException;
import java.util.HashSet;

import org.brijframework.base.graph.GraphPrinter;
import org.brijframework.beans.Address;
import org.brijframework.beans.City;
import org.brijframework.beans.Employee;
import org.brijframework.model.builder.BaseBuilder;
import org.brijframework.model.factories.AnnotationModelMetaInfoFactory;
import org.brijframework.model.factories.AnnotationPropertyMetaInfoFactory;
import org.brijframework.model.factories.PropertyMetaInfoFactoryImpl;
import org.brijframework.util.formatter.PrintUtil;

public class ModelBuilderTest {

	public static void main(String[] args) throws IOException {
		
		AnnotationModelMetaInfoFactory.getFactory().getCache();
		AnnotationPropertyMetaInfoFactory.getFactory().getCache();
		PropertyMetaInfoFactoryImpl.getFactory();
		Employee instance=new Employee();
		BaseBuilder builder=BaseBuilder.getBuilder(instance);
		/*
		 * builder.setProperty("name", "r"); builder.setProperty("rollNo", "10");
		 * builder.setProperty("address", new Address());
		 */
		Address address1=new Address();
		address1.setProperty("line", "noida 1");
		
		Address address2=new Address();
		address2.setProperty("line", "noida 2");
		builder.setProperty("addresses", new HashSet<>());
		builder.setProperty("addresses[0]", address1);
		builder.setProperty("addresses[1]", new Address());
		builder.setProperty("addresses[15]", address2);
		/*
		 * builder.setProperty("address.line", "noida");
		 * builder.setProperty("address.city", new City());
		 * builder.setProperty("address.city.name", "Gr Noida");
		 */
	    String object=PrintUtil.getObjectInfo(instance);
		
		System.out.println(object);
		
		GraphPrinter.getPrinter(instance).printToScreen();
		
	}
}
