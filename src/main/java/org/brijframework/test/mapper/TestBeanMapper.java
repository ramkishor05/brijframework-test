package org.brijframework.test.mapper;

import org.brijframework.bean.mapper.impl.GenericBeanMapper;
import org.brijframework.beans.Employee;
import org.brijframework.beans.EmployeeBean;
import org.brijframework.context.integration.ApplicationBoot;

public class TestBeanMapper {

	public static void main(String[] args) {
		ApplicationBoot.bootstraps();
		sourceMapper();
		targetMapper();
	}
	
	public static void sourceMapper() {
		System.err.println("----------------------Test source mapper -----------------");
		Employee toBean=new Employee();
		
		EmployeeBean frombean=new EmployeeBean();
		frombean.setID("201");
		frombean.setNAME("Source");
		frombean.setROLLNUM(1011);
		frombean.setCITY("Noida");
		
		GenericBeanMapper<Employee,EmployeeBean> employeeBeanMapper=new GenericBeanMapper<Employee,EmployeeBean>() {};
		employeeBeanMapper.sourceMapper(toBean,frombean);
		
		System.out.println("id = "+toBean.getProperty("id"));
		System.out.println("name = "+toBean.getProperty("name"));
		System.out.println("rollNo = "+toBean.getProperty("rollNo"));
		System.out.println("address.city.name = "+toBean.getProperty("address.city.name"));
		
	}
	
	public static void targetMapper() {
		System.err.println("----------------------Test desitination mapper -----------------");
		Employee toBean=new Employee();
		toBean.setId("1010");
		toBean.setProperty("name", "Target");
		toBean.setProperty("rollNo", "201301");
		toBean.setProperty("address.city.name", "Target Noida");
		
		EmployeeBean frombean=new EmployeeBean();
		
		GenericBeanMapper<Employee,EmployeeBean> employeeBeanMapper=new GenericBeanMapper<Employee,EmployeeBean>() {};
		employeeBeanMapper.targetMapper(toBean,frombean);
		
		System.out.println("ID = "+frombean.getID());
		System.out.println("NAME = "+frombean.getNAME());
		System.out.println("ROLLNUM = "+frombean.getROLLNUM());
		System.out.println("CITY = "+frombean.getCITY());
	}
}
