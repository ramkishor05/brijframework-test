package org.brijframework.test.model;

import org.brijframework.bean.factories.impl.BeanFactoryImpl;
import org.brijframework.dao.Employee;

public class ModelFactoryTest {

	public static void main(String[] args) {
		Employee instance1 = BeanFactoryImpl.getFactory().getBean("Employee_REQUEST");
		System.out.println(instance1);
		
		Employee instance2 = BeanFactoryImpl.getFactory().getBean("Employee_REQUEST");
		System.out.println(instance2);
		
		Employee instance3 = BeanFactoryImpl.getFactory().getBean("Employee_REQUEST");
		System.out.println(instance3);
		
		Employee instance4 = BeanFactoryImpl.getFactory().getBean("Employee");
		System.out.println(instance4);
		
		Employee instance5 = BeanFactoryImpl.getFactory().getBean("Employee");
		System.out.println(instance5);
		
		Employee instance6 = BeanFactoryImpl.getFactory().getBean("Employee_PROTOTYPE");
		System.out.println(instance6);
		
		Employee instance7 = BeanFactoryImpl.getFactory().getBean("Employee_PROTOTYPE");
		System.out.println(instance7);
		
		Employee instance8 = BeanFactoryImpl.getFactory().getBean("Employee_SINGLETON");
		System.out.println(instance8);
		
		Employee instance9 = BeanFactoryImpl.getFactory().getBean("Employee_SINGLETON");
		System.out.println(instance9);
	}

}
