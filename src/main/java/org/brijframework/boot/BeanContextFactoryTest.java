package org.brijframework.boot;

import org.brijframework.bean.context.BeanContext;
import org.brijframework.bean.util.BeanScopeUtil;
import org.brijframework.boot.runner.ApplicationContextRunner;
import org.brijframework.context.bootstrap.BootstrapContext;
import org.brijframework.dao.Address;

public class BeanContextFactoryTest {

	public static void main(String[] args) {
		BootstrapContext applicationContext = ApplicationContextRunner.run(args).getApplicationContext();
		BeanContext beanContext= (BeanContext) applicationContext.getModuleContext(BeanContext.class);
		Address address = beanContext.getBean("Address_001");
		address.printObject();
		
		BeanScopeUtil.setPropertyPath(address,"city.name", "OK",true);
		
		address.printObject();
	}
}
