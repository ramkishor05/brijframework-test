package org.brijframework.test.model;

import org.brijframework.bean.factories.impl.BeanFactory;
import org.brijframework.dao.Employee;

public class ModelFactoryTest {

	public static void main(String[] args) {
		Employee instance1 = BeanFactory.getFactory().getModel("Employee_REQUEST");
		System.out.println(instance1);
		
		Employee instance2 = BeanFactory.getFactory().getModel("Employee_REQUEST");
		System.out.println(instance2);
		
		Employee instance3 = BeanFactory.getFactory().getModel("Employee_REQUEST");
		System.out.println(instance3);
		
		Employee instance4 = BeanFactory.getFactory().getModel("Employee");
		System.out.println(instance4);
		
		Employee instance5 = BeanFactory.getFactory().getModel("Employee");
		System.out.println(instance5);
		
		Employee instance6 = BeanFactory.getFactory().getModel("Employee_PROTOTYPE");
		System.out.println(instance6);
		
		Employee instance7 = BeanFactory.getFactory().getModel("Employee_PROTOTYPE");
		System.out.println(instance7);
		
		Employee instance8 = BeanFactory.getFactory().getModel("Employee_SINGLETON");
		System.out.println(instance8);
		
		Employee instance9 = BeanFactory.getFactory().getModel("Employee_SINGLETON");
		System.out.println(instance9);
	}

}
