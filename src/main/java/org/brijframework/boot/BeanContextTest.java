package org.brijframework.boot;

import java.util.List;

import org.brijframework.bean.context.BeanContext;
import org.brijframework.bean.context.factories.BeanContextFactory;
import org.brijframework.context.factories.ApplicationContextFactory;
import org.brijframework.dao.Address;
import org.brijframework.env.Environment;

public class BeanContextTest {

	public static void main(String[] args) {
		ApplicationContextFactory.getFactory().getApplicationContext();
		BeanContext beanContext=BeanContextFactory.getFactory().getBeanContext();
		System.out.println(beanContext);
		
		Object object=beanContext.getBeanObject("Address_001");
		System.out.println("getBean="+object);
		
		List<?> addressList=beanContext.getBeanObjects(Address.class);
		System.out.println("Beans="+addressList);
		
		List<?> beanNames=beanContext.getBeanObjectNames();
		System.out.println("beanNames="+beanNames);
		
		List<?> beanNamesAddress=beanContext.getBeanObjectNames(Address.class);
		System.out.println("beanNames="+beanNamesAddress);
		
		Address address=beanContext.getBeanObject("Address_001",Address.class);
		System.out.println("getBean="+address);
		
		Environment environment=beanContext.getBeanObject("environment",Environment.class);
		System.out.println("environment="+environment);
		
		
	}
}
