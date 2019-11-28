package org.brijframework.test.model;

import org.brijframework.bean.context.BeanContext;
import org.brijframework.bean.context.factories.BeanContextFactory;
import org.brijframework.dao.Employee;

public class ModelFactoryTest {

	public static void main(String[] args) {
		BeanContext beanContext= BeanContextFactory.getFactory().getBeanContext();
		Employee instance1 = beanContext.getBeanObject("Employee_REQUEST");
		System.out.println(instance1);
		
		Employee instance2 = beanContext.getBeanObject("Employee_REQUEST");
		System.out.println(instance2);
		
		Employee instance3 = beanContext.getBeanObject("Employee_REQUEST");
		System.out.println(instance3);
		
		Employee instance4 = beanContext.getBeanObject("Employee");
		System.out.println(instance4);
		
		Employee instance5 = beanContext.getBeanObject("Employee");
		System.out.println(instance5);
		
		Employee instance6 = beanContext.getBeanObject("Employee_PROTOTYPE");
		System.out.println(instance6);
		
		Employee instance7 = beanContext.getBeanObject("Employee_PROTOTYPE");
		System.out.println(instance7);
		
		Employee instance8 = beanContext.getBeanObject("Employee_SINGLETON");
		System.out.println(instance8);
		
		Employee instance9 = beanContext.getBeanObject("Employee_SINGLETON");
		System.out.println(instance9);
	}

}
