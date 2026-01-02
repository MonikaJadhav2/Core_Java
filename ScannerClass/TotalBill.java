package com.scanner1;

// Take the price and quantity of a product and print total bill.
import java.util.Scanner;

class TotalBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Price: ");
        int price = sc.nextInt();
        
        System.out.println("Enter Quantity:");
        int qty = sc.nextInt();

        System.out.println("Total Bill = " + (price * qty));
        sc.close();
    }
}

