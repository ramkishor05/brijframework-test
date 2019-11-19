package org.brijframework.boot;

import org.brijframework.bean.context.factories.BeanContextFactory;

public class BeanContextFactoryTest {

	public static void main(String[] args) {
		BeanContextFactory contextFactory=BeanContextFactory.getFactory();
		contextFactory.loadFactory();
	}
}
