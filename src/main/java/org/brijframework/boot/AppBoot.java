package org.brijframework.boot;

import java.util.List;
import java.util.Map;

import org.brijframework.context.integration.ApplicationBoot;
import org.brijframework.jdbc.template.JdbcTemplate;
import org.brijframework.support.config.ApplicationBootstrap;
import org.brijframework.support.config.DatasourceBootstrap;

@ApplicationBootstrap(paths="application-bootstrap.properties|modelbeans-bootstrap.yml|datasource-bootstrap.yml")
@DatasourceBootstrap
public class AppBoot {

	public static void main(String[] args) throws Exception {
		for (String name : args){
            System.out.println("arg-" + name );
        }
		ApplicationBoot factory=ApplicationBoot.bootstraps(args);
		System.out.println("=================VarArgs==============");
		System.out.println(factory.getArguments().getNonParams());
		System.out.println("=================withArgs==============");
		System.out.println(factory.getArguments().getWithParams());
		/*
		Map<String, Object> properties=new HashMap<>();
		properties.put("annual_exam_gain_marks_id" , 1);
		properties.put("gain_marks" , 20);
		properties.put("annual_exam_report_id" , 1);
		properties.put("subject_id" , 1);
		
		JdbcTemplate template=new JdbcTemplate("fadsan_school");
		
		JdbcQualifier qualifier=new JdbcQualifier(); 
		qualifier.
		template.update("annual_exam_gain_marks", properties);
		template.update("annual_exam_gain_marks", properties);*/
		/*JdbcContext jdbcContext=new JdbcContext();
		jdbcContext.startup();
		
		System.out.println(jdbcContext.getProperties());*/
		
		JdbcTemplate template=new JdbcTemplate("fadsan_school");
		
		boolean result=template.statement().update("country").set("country_code", "1").where().equalTo("country_id", 4).execute();
		System.out.println(result);
		
		List<Map<String, Object>> query=template.statement().fetch("country").selected("country_code").selected("country_name").where().equalTo("country_code", 1).list();
		System.out.println(query);
		
		
		
		
		/*
		 
		  Tomcat tomcat=new Tomcat(); 
		  tomcat.setHostname("localhost");
		  tomcat.getServer().setPort(1200);
		  tomcat.start();
	      tomcat.getServer().await();
	      
	    */
	}
}
