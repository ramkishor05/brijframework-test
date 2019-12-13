package org.brijframework.boot;

import org.brijframework.boot.factories.BootstrapContextFactory;
import org.brijframework.support.app.EnvironmentResource;

@EnvironmentResource
public class BootstrapContextFactoryTest {

	public static void main(String[] args) throws Exception {
		BootstrapContextFactory.getFactory().getApplicationContext();
	}
}
