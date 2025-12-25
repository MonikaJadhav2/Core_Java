package com.pojo;

public class Employee {
	
	int empId;       //pojo class members/fields/variables/attributed
	String empName;
	double empSalary;
	String city;
	
	public Employee() {  //no args constructor
		
	}
	
	public Employee(int empId, String empName, double empSalary, String city) {   //args constructor
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.city = city;
		
		
	}

	public int getEmpId() {    //public getter and setter
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	// toString using fields
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", city=" + city + "]";   
	}
	
	@Override
	public int hashCode() {
		// TODO Auro-generated method stub
		return super.hashCode();
	}

}
