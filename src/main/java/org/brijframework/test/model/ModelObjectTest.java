package org.brijframework.test.model;

import org.brijframework.beans.Address;
import org.brijframework.beans.City;
import org.brijframework.beans.Employee;
import org.brijframework.model.data.ModelDataInfo;
import org.brijframework.model.factories.AnnotationModelMetaInfoFactory;
import org.brijframework.model.factories.AnnotationPropertyMetaInfoFactory;
import org.brijframework.model.factories.ModelDataInfoFactoryImpl;
import org.brijframework.model.factories.PropertyMetaInfoFactoryImpl;
import org.brijframework.util.formatter.PrintUtil;

/**
 * Hello world!
 *
 */
public class ModelObjectTest {
	public static void main(String[] args) {
		AnnotationModelMetaInfoFactory.getFactory().getCache();
		AnnotationPropertyMetaInfoFactory.getFactory().getCache();
		PropertyMetaInfoFactoryImpl.getFactory();
		Employee employee = new Employee();
		employee.setProperty("name", "r");
		employee.setProperty("rollNo", "10");
		employee.setProperty("address", new Address());
		employee.setProperty("address.line", "noida");
		employee.setProperty("address.city", new City());
		employee.setProperty("address.city.id", "1245");
		String object=PrintUtil.getObjectInfo(employee);
		System.out.println(object);
		ModelDataInfoFactoryImpl.getFactory().register(AnnotationModelMetaInfoFactory.getFactory().getModelInfo("Employee"));
		ModelDataInfo modelDataInfo=ModelDataInfoFactoryImpl.getFactory().getModelInfo("Employee");
		System.out.println(modelDataInfo.getInstances());
	}
}
