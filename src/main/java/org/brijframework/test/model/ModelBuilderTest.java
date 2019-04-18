package org.brijframework.test.model;

import java.io.IOException;

import org.brijframework.beans.Employee;
import org.brijframework.model.builder.GenericModelBuilder;
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
		GenericModelBuilder builder=GenericModelBuilder.getBuilder(instance);
		builder.setProperty("name", "r");
		builder.setProperty("rollNo", "10");
		
		//builder.setProperty("address", new Address());
		builder.setProperty("address.line", "noida");
		//builder.setProperty("address.city", new City());
		builder.setProperty("address.city.name", "Gr Noida");
		String object=PrintUtil.getObjectInfo(instance);
		System.out.println(object);
		
	}
}
