package org.brijframework.boot;

import org.brijframework.bean.context.BeanContext;
import org.brijframework.bean.context.factories.BeanContextFactory;
import org.brijframework.context.factories.ApplicationContextFactory;
import org.brijframework.dao.Address;
import org.brijframework.env.Environment;
import org.brijframework.util.printer.LoggerConsole;


public class BeanContextTest {
	
	
	public static void main(String[] args) {
		ApplicationContextFactory.getFactory().getApplicationContext();
		BeanContext beanContext=BeanContextFactory.getFactory().getBeanContext();
		
		LoggerConsole.screen("BeanResource");
		LoggerConsole.screen("BeanResourceNames()",""+beanContext.getBeanResourceNames());
		LoggerConsole.screen("BeanResourceNames(\"Address\")",""+beanContext.getBeanResourceNames("Address"));
		LoggerConsole.screen("BeanResource(\"Address_001\")",""+beanContext.getBeanResource("Address_001"));
		LoggerConsole.screen("BeanResourceList()",""+beanContext.getBeanResourceList());
		LoggerConsole.screen("BeanResourceList(\"Address_001\")",""+beanContext.getBeanResourceList("Address_001"));
				
		LoggerConsole.screen("BeanMetaData");
		LoggerConsole.screen("BeanMetaDataNames()",""+beanContext.getBeanMetaDataNames());
		LoggerConsole.screen("BeanMetaDataNames(\"Address\")",""+beanContext.getBeanMetaDataNames("Address"));
		LoggerConsole.screen("BeanMetaData(\"Address_001\")",""+beanContext.getBeanMetaData("Address_001"));
		LoggerConsole.screen("BeanMetaDataList()",""+beanContext.getBeanMetaDataList());
		LoggerConsole.screen("BeanMetaDataList(Address.class)",""+beanContext.getBeanMetaDataList(Address.class));
		
		LoggerConsole.screen("BeanObject");
		LoggerConsole.screen("Address_001",""+beanContext.getBeanObject("Address_001",Address.class));
		LoggerConsole.screen("Address_001",""+beanContext.getBeanObject("Address_001"));
		LoggerConsole.screen("Employee_003",""+beanContext.getBeanObject("Employee_003"));
		LoggerConsole.screen("Address",""+beanContext.getBeanObject(Address.class));
		LoggerConsole.screen("environment1",""+beanContext.getBeanObject("environment",Environment.class));
		LoggerConsole.screen("environment2",""+beanContext.getBeanObject("environment",Environment.class));
	}
}
