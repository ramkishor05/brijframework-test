package org.brijframework.test.model;

import org.brijframework.BaseObject;
import org.brijframework.beans.Address;
import org.brijframework.beans.City;
import org.brijframework.beans.Employee;
import org.brijframework.model.builder.ModelBuilder;
import org.brijframework.model.factories.AnnotationModelMetaInfoFactory;
import org.brijframework.model.factories.AnnotationPropertyMetaInfoFactory;
import org.brijframework.model.factories.PropertyMetaInfoFactoryImpl;
import org.brijframework.util.formatter.PrintUtil;

public class ModelBuilderTest {

	public static void main(String[] args) {
		AnnotationModelMetaInfoFactory.getFactory().getCache();
		AnnotationPropertyMetaInfoFactory.getFactory().getCache();
		PropertyMetaInfoFactoryImpl.getFactory();
		Employee instance=new Employee();
		ModelBuilder builder=ModelBuilder.getBuilder(instance);
		builder.setProperty("name", "r");
		builder.setProperty("rollNo", "10");
		builder.setProperty("address", new Address());
		builder.setProperty("address.line", "noida");
		builder.setProperty("address.city", new City());
		builder.setProperty("address.city.id", "1245");
		String object=PrintUtil.getObjectInfo(instance);
		System.out.println(object);
		
	}
}
