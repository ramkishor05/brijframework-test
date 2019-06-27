package org.brijframework.boot;

import java.io.File;
import java.util.Properties;

import org.brijframework.context.ApplicationContext;
import org.brijframework.util.resouces.YamlUtil;

public class AppBoot {

	public static void main(String[] args) {
		/*ApplicationContext context = new ApplicationContext();
		context.startup();*/
		Properties envproperties=YamlUtil.getEnvProperties(new File("E:\\brijframe\\brijframework-test\\src\\main\\resources\\application.yml"));
		//System.out.println(envproperties.get("application.bootstrap.config.model.data"));
		System.out.println(envproperties);
	}
}
