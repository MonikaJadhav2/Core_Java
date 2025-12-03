package com.encapsulation;

public class Vehicle {

	private String vehicleNo;
	private String vName;
	private int model;
	
	public String getVehicleNo() {
		return vehicleNo;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
}
        