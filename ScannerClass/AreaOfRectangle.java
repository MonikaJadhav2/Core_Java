package com.scanner1;

//Take length and width and calculate area of rectangle.

import java.util.Scanner;

class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = sc.nextInt();
        
        System.out.println("Enter Width: ");
        int width = sc.nextInt();

        System.out.println("Area = " + (length * width));
        sc.close();
    }
}
