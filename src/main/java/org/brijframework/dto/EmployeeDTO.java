package org.brijframework.dto;

import org.brijframework.support.model.mapper.ModelMapper;

@ModelMapper(source="EmployeeBean", destination="Employee")
public class EmployeeDTO {

	@ModelMapper(source = "ID", destination="id")
	private String ID;

	@ModelMapper(source = "NAME", destination="name")
	private String NAME;

	@ModelMapper(source = "ROLLNUM", destination="rollNo")
	private long ROLLNUM;
	
	@ModelMapper(source = "CITY", destination="address.city.name")
	private String CITY;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public long getROLLNUM() {
		return ROLLNUM;
	}

	public void setROLLNUM(long rOLLNUM) {
		ROLLNUM = rOLLNUM;
	}
	
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	
	public String getCITY() {
		return CITY;
	}
}
