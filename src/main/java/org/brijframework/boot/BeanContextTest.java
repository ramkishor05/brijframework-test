package org.brijframework.boot;

import org.brijframework.bean.context.BeanContext;
import org.brijframework.bean.context.factories.BeanContextFactory;
import org.brijframework.bean.scope.monitor.factories.SessionScopeMonitorFactroy;
import org.brijframework.context.factories.ApplicationContextFactory;
import org.brijframework.dao.Address;
import org.brijframework.env.Environment;
import org.brijframework.support.enums.Scope;
import org.brijframework.util.printer.LoggerConsole;


public class BeanContextTest {
	
	
	public static void main(String[] args) {
		ApplicationContextFactory.getFactory().getApplicationContext();
		BeanContext beanContext=BeanContextFactory.getFactory().getBeanContext();
		
		LoggerConsole.screen("BeanResource");
		LoggerConsole.screen("BeanResourceNameList()",""+beanContext.getBeanResourceNameList());
		LoggerConsole.screen("BeanResourceNameList(\"Address\")",""+beanContext.getBeanResourceNamesList("Address"));
		LoggerConsole.screen("BeanResource(\"Address_001\")",""+beanContext.getBeanResource("Address_001"));
		LoggerConsole.screen("BeanResourceList()",""+beanContext.getBeanResourceList());
		LoggerConsole.screen("BeanResourceList(\"Address_001\")",""+beanContext.getBeanResourceList("Address_001"));
				
		LoggerConsole.screen("BeanDefinition");
		LoggerConsole.screen("BeanDefinitionNameList()",""+beanContext.getBeanDefinitionNameList());
		LoggerConsole.screen("BeanDefinitionNameList(\"Address\")",""+beanContext.getBeanDefinitionNameList("Address"));
		LoggerConsole.screen("BeanDefinition(\"Address_001\")",""+beanContext.getBeanDefinition("Address_001"));
		LoggerConsole.screen("BeanDefinitionList()",""+beanContext.getBeanDefinitionList());
		LoggerConsole.screen("BeanDefinitionList(Address.class)",""+beanContext.getBeanDefinitionList(Address.class));
		
		LoggerConsole.screen("BeanObject");
		
		LoggerConsole.screen("BeanNameList",""+beanContext.getBeanNameList());
		LoggerConsole.screen("BeanNameList",""+beanContext.getBeanNameList(Address.class));
		LoggerConsole.screen("Address_001",""+beanContext.getBean("Address_001",Address.class));
		SessionScopeMonitorFactroy.factory().currentService();
		
		LoggerConsole.screen("Address_001",""+beanContext.getBean("Address_001"));
		LoggerConsole.screen("Employee_003",""+beanContext.getBean("Employee_003"));
		LoggerConsole.screen("Address",""+beanContext.getBean(Address.class));
		LoggerConsole.screen("environment1",""+beanContext.getBean("environment",Environment.class));
		LoggerConsole.screen("environment2",""+beanContext.getBean("environment",Environment.class));
		
		LoggerConsole.screen("BeanScope",""+beanContext.getBeanList(Scope.SINGLETON));
		LoggerConsole.screen("BeanScope",""+beanContext.getBeanDefinitionList(Scope.SINGLETON));
		LoggerConsole.screen("BeanScope",""+beanContext.getBeanResourceList(Scope.SINGLETON));
	}
}
