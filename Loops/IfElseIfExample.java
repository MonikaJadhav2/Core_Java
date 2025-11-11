package com.loops;

public class IfElseIfExample {
    public static void main(String[] args) {

        int marks = 85; // You can change this value to test different outputs

        // Check grade based on marks
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
