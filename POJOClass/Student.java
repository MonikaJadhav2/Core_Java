package com.pojo;

public class Student {
	
	int stdId;
	String stdName;
	String city;
	College cld;
	
	
	public Student() {
	
	}


	public Student(int stdId, String stdName, String city, College cld) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.city = city;
		this.cld = cld;
	}


	public int getStdId() {
		return stdId;
	}


	public void setStdId(int stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public College getCld() {
		return cld;
	}


	public void setCld(College cld) {
		this.cld = cld;
	}


	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", city=" + city + ", cld=" + cld + "]";
	}
	
	
	

}
