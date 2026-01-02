package com.scanner1;

import java.util.Scanner;

//Take employee name, id, and salary and print employee details.
class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Id: ");
        int id = sc.nextInt();
        
        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);

        sc.close();
    }
}

