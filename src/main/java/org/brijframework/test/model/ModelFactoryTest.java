package org.brijframework.test.model;

import org.brijframework.beans.Employee;
import org.brijframework.model.factories.ModelFactory;

public class ModelFactoryTest {

	public static void main(String[] args) {
		Employee instance1=ModelFactory.getFactory().getModel("Employee_REQUEST");
		System.out.println(instance1);
		Employee instance2=ModelFactory.getFactory().getModel("Employee_REQUEST");
		System.out.println(instance2);
		Employee instance3=ModelFactory.getFactory().getModel("Employee_REQUEST");
		System.out.println(instance3);
		Employee instance4=ModelFactory.getFactory().getModel("Employee");
		System.out.println(instance4);
		Employee instance5=ModelFactory.getFactory().getModel("Employee");
		System.out.println(instance5);
		Employee instance6=ModelFactory.getFactory().getModel("Employee_PROTOTYPE");
		System.out.println(instance6);
		Employee instance7= ModelFactory.getFactory().getModel("Employee_PROTOTYPE");
		System.out.println(instance7);
		
		Employee instance8=ModelFactory.getFactory().getModel("Employee_SINGLETON");
		System.out.println(instance8);
		Employee instance9= ModelFactory.getFactory().getModel("Employee_SINGLETON");
		System.out.println(instance9);
	}

}
