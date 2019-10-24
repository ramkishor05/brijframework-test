package org.brijframework.boot;

import org.brijframework.context.integration.ApplicationBoot;
import org.brijframework.dao.Employee;
import org.brijframework.dto.EmployeeDTO;
import org.brijframework.mapper.GenericMapper;
import org.brijframework.support.config.ApplicationBootstrap;
import org.brijframework.support.config.DatasourceBootstrap;

@ApplicationBootstrap(paths="application-bootstrap.properties|modelbeans-bootstrap.yml|datasource-bootstrap.yml")
@DatasourceBootstrap
public class GenericMapperTest {

	public static void main(String[] args) {
		ApplicationBoot.bootstraps();
		GenericMapper<EmployeeDTO,Employee> employeeMapper=new GenericMapper<EmployeeDTO,Employee>() {};
		EmployeeDTO source=new EmployeeDTO();
		source.setID("201");
		source.setNAME("Ram");
		source.setROLLNUM(1011);
		source.setCITY("Noida");
		
		employeeMapper.source(source);
	}
}
