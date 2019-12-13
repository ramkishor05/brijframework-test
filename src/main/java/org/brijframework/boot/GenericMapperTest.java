package org.brijframework.boot;

import org.brijframework.boot.factories.BootstrapContextFactory;
import org.brijframework.dao.Employee;
import org.brijframework.dto.EmployeeDTO;
import org.brijframework.model.mapper.GenericMapper;
import org.brijframework.support.config.EnvironmentConfig;

@EnvironmentConfig(paths="application-bootstrap.properties|modelbeans-bootstrap.yml|datasource-bootstrap.yml")
public class GenericMapperTest {

	public static void main(String[] args) {
		BootstrapContextFactory.getFactory();
		GenericMapper<EmployeeDTO,Employee> employeeMapper=new GenericMapper<EmployeeDTO,Employee>() {};
		EmployeeDTO source=new EmployeeDTO();
		source.setID("201");
		source.setNAME("Ram");
		source.setROLLNUM(1011);
		source.setCITY("Noida");
		
		employeeMapper.source(source);
	}
}
