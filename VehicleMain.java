package com.encapsulation;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setVehicleNo("MH12344");
		v.setModel(12345);
		v.setvName("Tata");
		
		System.out.println("Vehicle No = " + v.getVehicleNo());
		System.out.println("Vehicle Model = " + v.getModel());
		System.out.println("Vehicle Name = " + v.getvName());
		
	}
}