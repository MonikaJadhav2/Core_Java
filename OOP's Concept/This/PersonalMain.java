package com.this1;

public class PersonalMain {
	public static void main(String[] args) {

		Personal p = new Personal();
		p.PersonalInfo("Monika", "Jadhav", 12, 9876543210L, "monika@example.com", "Pune", "Maharashtra", "India",
				"Female", "B.E Computer Engineering");

		p.displayInfo();
	}
}
