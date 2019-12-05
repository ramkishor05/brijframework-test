package org.brijframework.test.model;

import org.brijframework.bean.context.BeanContext;
import org.brijframework.bean.context.factories.BeanContextFactory;
import org.brijframework.dao.Employee;

public class ModelFactoryTest {

	public static void main(String[] args) {
		BeanContext beanContext= BeanContextFactory.getFactory().getBeanContext();
		Employee instance1 = beanContext.getBean("Employee_REQUEST");
		System.out.println(instance1);
		
		Employee instance2 = beanContext.getBean("Employee_REQUEST");
		System.out.println(instance2);
		
		Employee instance3 = beanContext.getBean("Employee_REQUEST");
		System.out.println(instance3);
		
		Employee instance4 = beanContext.getBean("Employee");
		System.out.println(instance4);
		
		Employee instance5 = beanContext.getBean("Employee");
		System.out.println(instance5);
		
		Employee instance6 = beanContext.getBean("Employee_PROTOTYPE");
		System.out.println(instance6);
		
		Employee instance7 = beanContext.getBean("Employee_PROTOTYPE");
		System.out.println(instance7);
		
		Employee instance8 = beanContext.getBean("Employee_SINGLETON");
		System.out.println(instance8);
		
		Employee instance9 = beanContext.getBean("Employee_SINGLETON");
		System.out.println(instance9);
	}

}
