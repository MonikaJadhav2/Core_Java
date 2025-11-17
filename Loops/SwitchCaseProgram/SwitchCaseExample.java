package com.loops;

public class SwitchCaseExample {
    public static void main(String[] args) {

        char operation = '+';   // change this to -, *, /, %

        int a = 3, b = 4;

        switch (operation) {

            case '+':
                System.out.println("Addition: " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;

            case '/':
                System.out.println("Division: " + (a / b));
                break;

            case '%':
                System.out.println("Modulus: " + (a % b));
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
