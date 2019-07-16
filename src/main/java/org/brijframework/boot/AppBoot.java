package org.brijframework.boot;

import org.brijframework.beans.Address;
import org.brijframework.beans.Employee;
import org.brijframework.mapper.asm.GenericMapper;
import org.brijframework.mapper.model.impl.AnnotationClsMapperModelFactory;
import org.brijframework.support.config.ApplicationBootstrap;
import org.brijframework.support.config.DatasourceBootstrap;

@ApplicationBootstrap(paths="application-bootstrap.properties|modelbeans-bootstrap.yml|datasource-bootstrap.yml")
@DatasourceBootstrap
public class AppBoot {

	public static void main(String[] args) throws Exception {
		AnnotationClsMapperModelFactory.getFactory().loadFactory();
		GenericMapper<Employee> mapper=new GenericMapper<Employee>() {};
		Employee employee=mapper.mapped(new Address());
		System.out.println(employee);
		/*ApplicationBoot factory=ApplicationBoot.bootstraps(args);*/
		
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
		
		//JdbcTemplate template=new JdbcTemplate("fadsan_school");
		
		/*boolean result=template.statement().update("country").setProperty("country_code", "1").where().equalTo("country_id", 4).result();
		System.out.println(result);*/
		
		/*template.statement().fetch("country").all().limit(5).forBatch(list->{
			System.out.println(list);
		});*/
		
		/*
		 
		  Tomcat tomcat=new Tomcat(); 
		  tomcat.setHostname("localhost");
		  tomcat.getServer().setPort(1200);
		  tomcat.start();
	      tomcat.getServer().await();
	      
	    */
	}
}
