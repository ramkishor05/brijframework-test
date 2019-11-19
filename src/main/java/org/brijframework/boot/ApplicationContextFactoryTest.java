package org.brijframework.boot;

import org.brijframework.context.ApplicationContext;
import org.brijframework.context.factories.ApplicationContextFactory;

public class ApplicationContextFactoryTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext beanContext = ApplicationContextFactory.getFactory().getApplicationContext();
		System.out.println("beanContext="+beanContext);
	}
}
