package org.brijframework.boot;

import org.brijframework.context.ApplicationContext;

public class AppBoot {

	public static void main(String[] args) {
		ApplicationContext context = new ApplicationContext();
		context.startup();
	}
}
