package org.brijframework.boot;

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
		//ApplicationBoot factory=ApplicationBoot.bootstraps();
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
		String query=template.statement().fetch("country").selected("address").
		selected("city").
		where().
		equalTo("address", 1).
		or().
		equalTo("city", "noida").
		and().
		greaterThan("zip", 2015).
		or().
		lessThanEqualTo("zip", 2015).query();
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
