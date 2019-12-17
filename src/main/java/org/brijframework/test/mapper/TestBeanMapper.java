package org.brijframework.test.mapper;

import org.brijframework.boot.runner.ApplicationContextRunner;
import org.brijframework.dao.Employee;
import org.brijframework.dto.EmployeeDTO;
import org.brijframework.model.mapper.GenericMapper;

public class TestBeanMapper {

	public static void main(String[] args) {
		ApplicationContextRunner.run();
		sourceMapper();
		targetMapper();
	}
	
	public static void sourceMapper() {
		System.err.println("----------------------Test source mapper -----------------");
		Employee toBean=new Employee();
		
		EmployeeDTO frombean = new EmployeeDTO();
		frombean.setID("201");
		frombean.setNAME("Source");
		frombean.setROLLNUM(1011);
		frombean.setCITY("Noida");
		
		GenericMapper<Employee, EmployeeDTO> employeeBeanMapper=new GenericMapper<Employee, EmployeeDTO>() {};
		employeeBeanMapper.target(frombean);
		
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
		
		EmployeeDTO frombean=new EmployeeDTO();
		
		GenericMapper<Employee,EmployeeDTO> employeeBeanMapper=new GenericMapper<Employee, EmployeeDTO>() {};
		employeeBeanMapper.source(toBean);
		
		System.out.println("ID = "+frombean.getID());
		System.out.println("NAME = "+frombean.getNAME());
		System.out.println("ROLLNUM = "+frombean.getROLLNUM());
		System.out.println("CITY = "+frombean.getCITY());
	}
}
