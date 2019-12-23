package org.brijframework.boot;

import org.brijframework.Access;
import org.brijframework.bean.context.BeanContext;
import org.brijframework.bean.util.BeanScopeUtil;
import org.brijframework.boot.runner.ApplicationContextRunner;
import org.brijframework.context.bootstrap.BootstrapContext;
import org.brijframework.dao.Address;

public class BeanContextFactoryTest {

	public static void main(String[] args) {
		BootstrapContext applicationContext = ApplicationContextRunner.run(args).getApplicationContext();

		BeanContext beanContext = (BeanContext) applicationContext.getModuleContext(BeanContext.class);

		System.out.println(beanContext.getBeanDefinition("Address_001").getOwner());

		Address address = beanContext.getBean("Address_001");
		/*
		 * address.printObject();
		 * 
		 * BeanScopeUtil.setPropertyPath(address,"employee@ref", "Employee_002",true);
		 * 
		 * address.printObject();
		 */
		System.out.println((String) BeanScopeUtil.getPropertyPath(address, "employee.name", true, true));

		System.out.println(BeanScopeUtil.getPropertiesNames(address, Access.READ_ONLY, Access.READ_WRITE));

		System.out.println(BeanScopeUtil.getPropertiesNames(address, Access.WRITE_ONLY, Access.READ_WRITE));

		System.out.println(BeanScopeUtil.getPropertiesPath(address, true, true));
	}
}
