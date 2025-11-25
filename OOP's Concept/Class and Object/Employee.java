package com.oops;

public class Employee {

	// Global variables (instance variables)
	int id;
	String name;
	String department;
	float salary;
	boolean isPermanent;
	char grade;

	public static void main(String[] args) {

		// Creating 10 employee objects

		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "Monika";
		e1.department = "IT";
		e1.salary = 85000.50f;
		e1.isPermanent = true;
		e1.grade = 'A';

		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "komal";
		e2.department = "HR";
		e2.salary = 88000.75f;
		e2.isPermanent = true;
		e2.grade = 'B';

		Employee e3 = new Employee();
		e3.id = 3;
		e3.name = "Snehal";
		e3.department = "Finance";
		e3.salary = 62000.00f;
		e3.isPermanent = false;
		e3.grade = 'A';

		Employee e4 = new Employee();
		e4.id = 4;
		e4.name = "Shreya";
		e4.department = "Sales";
		e4.salary = 55000.30f;
		e4.isPermanent = true;
		e4.grade = 'C';

		Employee e5 = new Employee();
		e5.id = 105;
		e5.name = "Rohit";
		e5.department = "Sports";
		e5.salary = 73000.20f;
		e5.isPermanent = false;
		e5.grade = 'B';

		Employee e6 = new Employee();
		e6.id = 6;
		e6.name = "Virat";
		e6.department = "Marketing";
		e6.salary = 41000.00f;
		e6.isPermanent = true;
		e6.grade = 'A';

		Employee e7 = new Employee();
		e7.id = 107;
		e7.name = "Anshul";
		e7.department = "Development";
		e7.salary = 70000.00f;
		e7.isPermanent = true;
		e7.grade = 'A';

		Employee e8 = new Employee();
		e8.id = 108;
		e8.name = "Mahesh";
		e8.department = "Testing";
		e8.salary = 96000.10f;
		e8.isPermanent = false;
		e8.grade = 'B';

		Employee e9 = new Employee();
		e9.id = 109;
		e9.name = "Priti";
		e9.department = "Support";
		e9.salary = 38000.90f;
		e9.isPermanent = true;
		e9.grade = 'C';

		Employee e10 = new Employee();
		e10.id = 10;
		e10.name = "Ovi";
		e10.department = "Training";
		e10.salary = 50000.00f;
		e10.isPermanent = true;
		e10.grade = 'A';

		 // Printing Each Employee With New Lines
        System.out.println("\n----- Employee 1 Details -----");
        System.out.println("ID: " + e1.id);
        System.out.println("Name: " + e1.name);
        System.out.println("Department: " + e1.department);
        System.out.println("Salary: " + e1.salary);
        System.out.println("Permanent: " + e1.isPermanent);
        System.out.println("Grade: " + e1.grade);

        System.out.println("\n----- Employee 2 Details -----");
        System.out.println("ID: " + e2.id);
        System.out.println("Name: " + e2.name);
        System.out.println("Department: " + e2.department);
        System.out.println("Salary: " + e2.salary);
        System.out.println("Permanent: " + e2.isPermanent);
        System.out.println("Grade: " + e2.grade);

        System.out.println("\n----- Employee 3 Details -----");
        System.out.println("ID: " + e3.id);
        System.out.println("Name: " + e3.name);
        System.out.println("Department: " + e3.department);
        System.out.println("Salary: " + e3.salary);
        System.out.println("Permanent: " + e3.isPermanent);
        System.out.println("Grade: " + e3.grade);

        System.out.println("\n----- Employee 4 Details -----");
        System.out.println("ID: " + e4.id);
        System.out.println("Name: " + e4.name);
        System.out.println("Department: " + e4.department);
        System.out.println("Salary: " + e4.salary);
        System.out.println("Permanent: " + e4.isPermanent);
        System.out.println("Grade: " + e4.grade);

        System.out.println("\n----- Employee 5 Details -----");
        System.out.println("ID: " + e5.id);
        System.out.println("Name: " + e5.name);
        System.out.println("Department: " + e5.department);
        System.out.println("Salary: " + e5.salary);
        System.out.println("Permanent: " + e5.isPermanent);
        System.out.println("Grade: " + e5.grade);

        System.out.println("\n----- Employee 6 Details -----");
        System.out.println("ID: " + e6.id);
        System.out.println("Name: " + e6.name);
        System.out.println("Department: " + e6.department);
        System.out.println("Salary: " + e6.salary);
        System.out.println("Permanent: " + e6.isPermanent);
        System.out.println("Grade: " + e6.grade);

        System.out.println("\n----- Employee 7 Details -----");
        System.out.println("ID: " + e7.id);
        System.out.println("Name: " + e7.name);
        System.out.println("Department: " + e7.department);
        System.out.println("Salary: " + e7.salary);
        System.out.println("Permanent: " + e7.isPermanent);
        System.out.println("Grade: " + e7.grade);

        System.out.println("\n----- Employee 8 Details -----");
        System.out.println("ID: " + e8.id);
        System.out.println("Name: " + e8.name);
        System.out.println("Department: " + e8.department);
        System.out.println("Salary: " + e8.salary);
        System.out.println("Permanent: " + e8.isPermanent);
        System.out.println("Grade: " + e8.grade);

        System.out.println("\n----- Employee 9 Details -----");
        System.out.println("ID: " + e9.id);
        System.out.println("Name: " + e9.name);
        System.out.println("Department: " + e9.department);
        System.out.println("Salary: " + e9.salary);
        System.out.println("Permanent: " + e9.isPermanent);
        System.out.println("Grade: " + e9.grade);

        System.out.println("\n----- Employee 10 Details -----");
        System.out.println("ID: " + e10.id);
        System.out.println("Name: " + e10.name);
        System.out.println("Department: " + e10.department);
        System.out.println("Salary: " + e10.salary);
        System.out.println("Permanent: " + e10.isPermanent);
        System.out.println("Grade: " + e10.grade);

	}

}
