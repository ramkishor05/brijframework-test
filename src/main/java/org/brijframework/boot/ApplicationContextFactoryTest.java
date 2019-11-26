package org.brijframework.boot;

import org.brijframework.bean.factories.BeanFactory;
import org.brijframework.bean.factories.impl.BeanFactoryImpl;
import org.brijframework.context.factories.ApplicationContextFactory;
import org.brijframework.support.config.application.EnvironmentResource;

@EnvironmentResource
public class ApplicationContextFactoryTest {

	public static void main(String[] args) throws Exception {
		ApplicationContextFactory.getFactory().getApplicationContext();
	
		BeanFactory beanFactory=BeanFactoryImpl.getFactory();
		Object object=beanFactory.getBean("Address");
		System.out.println("object="+object);
	}
}
