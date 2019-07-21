package org.brijframework.beans;

import org.brijframework.support.mapper.Mapper;

@Mapper(source="EmployeeBean", destination="Employee")
public class EmployeeBean {

	@Mapper(source = "ID", destination="id")
	private String ID;

	@Mapper(source = "NAME", destination="name")
	private String NAME;

	@Mapper(source = "ROLLNUM", destination="rollNo")
	private long ROLLNUM;
	
	@Mapper(source = "CITY", destination="address.city.name")
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
