package org.brijframework.boot;

import org.brijframework.context.ApplicationContext;
import org.brijframework.context.factories.ApplicationContextFactory;
import org.brijframework.env.Environment;
import org.brijframework.factories.impl.bootstrap.env.EnvironmentFactory;
import org.brijframework.support.config.application.EnvironmentResource;

@EnvironmentResource
public class ApplicationContextFactoryTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext beanContext = ApplicationContextFactory.getFactory().getApplicationContext();
		System.out.println("beanContext="+beanContext);
		Environment environment = EnvironmentFactory.getFactory().getEnvironment();
		System.out.println("environment="+environment);
	}
}
