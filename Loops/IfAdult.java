package com.loops;

import java.util.Scanner;

public class IfAdult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18 && age < 60) {
            System.out.println("Adult");
        } 
        else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } 
        else if (age >= 0 && age < 13) {
            System.out.println("Child");
        } 
        else {
            System.out.println("Senior Citizen");
        }
    }
}
