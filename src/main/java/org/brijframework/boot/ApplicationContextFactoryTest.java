package org.brijframework.boot;

import org.brijframework.context.factories.ApplicationContextFactory;
import org.brijframework.support.config.application.EnvironmentResource;

@EnvironmentResource
public class ApplicationContextFactoryTest {

	public static void main(String[] args) throws Exception {
		ApplicationContextFactory.getFactory().getApplicationContext();
	
	}
}
