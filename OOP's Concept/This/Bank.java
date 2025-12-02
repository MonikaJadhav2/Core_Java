package com.this1;

public class Bank {

	int branchId;
	String bankName;
	String ifscCode;
	long accNo;
	String city;

	void bankDetails(int branchId, String bankName, String ifscCode, long accNo, String city) {
//		branchId = this.branchId;
//		bankName = this.bankName;
//		ifscCode = this.ifscCode;
//		accNo = this.accNo;
//		city = this.city;

		this.branchId = branchId;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.accNo = accNo;
		this.city = city;

		System.err.println("=========Bank Details========");
		System.out.println("Branch Id = " + branchId);
		System.out.println("Bank Name = " + bankName);
		System.out.println("IFSC code = " + ifscCode);
		System.out.println("Account no = " + accNo);
		System.out.println("City = " + city);
	}

}
