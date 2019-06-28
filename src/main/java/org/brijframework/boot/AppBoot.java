package org.brijframework.boot;

import org.apache.catalina.Host;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.brijframework.context.ApplicationContext;
import org.brijframework.support.config.Application;

@Application(paths="application-bootstrap.properties|application.properties")
public class AppBoot {

	public static void main(String[] args) throws LifecycleException {
		/*ApplicationContext context = new ApplicationContext();
		context.startup();
		System.out.println(context.getProperties());
		System.out.println(context.getConfigration().getProperties());*/
		Tomcat tomcat=new Tomcat();
		Host host=new StandardHost();
		host.setName("localhost");
		tomcat.setHost(host);
		tomcat.start();
	}
}
