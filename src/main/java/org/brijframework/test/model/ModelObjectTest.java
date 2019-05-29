package org.brijframework.test.model;

import org.brijframework.meta.reflect.ClassMeta;
import org.brijframework.model.factories.json.JsonModelMetaInfoFactory;

/**
 * Hello world!
 *
 */
public class ModelObjectTest {
	public static void main(String[] args) {
		/*TestingModel employee = ModelFactory.getFactory().getModel("Employee_REQUEST");
		employee.printObject();*/
		ClassMeta classMeta= JsonModelMetaInfoFactory.getFactory().getMeta("TestingModel_001");
		System.out.println(classMeta.getProperties());;
	}
}
