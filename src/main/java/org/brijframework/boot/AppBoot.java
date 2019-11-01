package org.brijframework.boot;

import org.brijframework.context.ApplicationContext;
import org.brijframework.context.integration.ApplicationContextFactory;
import org.brijframework.model.context.ModelContext;

public class AppBoot {

	public static void main(String[] args) throws Exception {
		ApplicationContextFactory applicationBoot=ApplicationContextFactory.getFactory();
		ApplicationContext applicationContext = applicationBoot.getApplicationContext();
		System.out.println(applicationContext.getContexts(ModelContext.class));
	}
}
