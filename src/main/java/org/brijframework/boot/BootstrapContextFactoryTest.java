package org.brijframework.boot;

import org.brijframework.boot.runner.ApplicationContextRunner;
import org.brijframework.support.app.EnvironmentResource;

@EnvironmentResource
public class BootstrapContextFactoryTest {

	public static void main(String[] args) throws Exception {
		ApplicationContextRunner.run().getApplicationContext();
	}
}
