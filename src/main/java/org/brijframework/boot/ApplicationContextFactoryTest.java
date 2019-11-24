package org.brijframework.boot;

import org.brijframework.context.ApplicationContext;
import org.brijframework.context.factories.ApplicationContextFactory;
import org.brijframework.context.factories.ApplicationEnvironmentFactory;
import org.brijframework.env.Environment;
import org.brijframework.support.config.application.EnvironmentResource;

@EnvironmentResource
public class ApplicationContextFactoryTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext beanContext = ApplicationContextFactory.getFactory().getApplicationContext();
		System.out.println("beanContext="+beanContext);
		Environment environment = ApplicationEnvironmentFactory.getFactory().getEnvironment();
		System.out.println("environment="+environment);
	}
}
