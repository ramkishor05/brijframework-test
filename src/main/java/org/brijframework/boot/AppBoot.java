package org.brijframework.boot;

import org.brijframework.bean.mapper.impl.GenericBeanMapper;
import org.brijframework.beans.Employee;
import org.brijframework.beans.EmployeeBean;
import org.brijframework.context.integration.ApplicationBoot;
import org.brijframework.support.config.ApplicationBootstrap;
import org.brijframework.support.config.DatasourceBootstrap;

@ApplicationBootstrap(paths="application-bootstrap.properties|modelbeans-bootstrap.yml|datasource-bootstrap.yml")
@DatasourceBootstrap
public class AppBoot {

	public static void main(String[] args) throws Exception {
		ApplicationBoot.bootstraps();
		
		/*GenericMapper<Employee> employeeMapper=new GenericMapper<Employee>() {};
		EmployeeBean frombean=new EmployeeBean();
		frombean.setID("201");
		frombean.setNAME("Ram");
		frombean.setROLLNUM(1011);
		frombean.setCITY("Noida");*/
		
		Employee toBean=new Employee();
		EmployeeBean frombean=new EmployeeBean();
		frombean.setID("201");
		frombean.setNAME("Ram");
		frombean.setROLLNUM(1011);
		frombean.setCITY("Noida");
		/*employeeMapper.mappedTo(toBean,frombean);
		System.out.println(PrintUtil.getObjectInfo(toBean));*/
		GenericBeanMapper<Employee,EmployeeBean> employeeBeanMapper=new GenericBeanMapper<Employee,EmployeeBean>() {};
		
		employeeBeanMapper.sourceMapper(toBean,frombean);
		System.out.println((String)toBean.getProperty("address.city.name"));
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
