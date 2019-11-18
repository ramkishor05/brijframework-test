package org.brijframework.boot;

import org.brijframework.bean.context.BeanContext;
import org.brijframework.bean.context.factories.BeanContextFactory;

public class AppBoot {

	public static void main(String[] args) throws Exception {
		//ApplicationContextFactory applicationBoot=ApplicationContextFactory.getFactory();
		//ApplicationContext applicationContext = applicationBoot.getApplicationContext();
		BeanContext beanContext = BeanContextFactory.getFactory().getBeanContext(BeanContext.class);
		System.out.println("beanContext="+beanContext);
	}
}
