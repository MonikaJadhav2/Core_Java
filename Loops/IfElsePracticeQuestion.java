package com.loops;
import java.util.*;

/*Practise Questions : 

Write a program that checks if a person’s age is greater than 18, then print "Adult".
Write a program to check whether a number is divisible by 10.
Write a program to check whether a temperature is above 30°C, then print "Hot Day".


Write a program to check whether a number is even or odd.
Write a program to check whether a given year is leap year or not.
Write a program to check whether a number is positive or negative.


Write a program to find grade of a student based on marks:
90–100 → Grade A
75–89 → Grade B
50–74 → Grade C
35–49 → Grade D
Below 35 → Fail

Write a program to print the day of the week based on day number (1–7).
Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene).

Write a program to print a message based on age group:

0–12 → Child
13–19 → Teenager
20–59 → Adult
60+ → Senior Citizen

Write a program to classify a temperature as Hot, Warm, Cool, or Cold.
Write a program to check whether a number is positive, negative, or zero.
Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).
Write a program to check if a year is leap year, and if leap, check if it’s a century year.
Write a program to check whether a number is even, and if even, check whether it’s greater than 50.*/

public class IfElsePracticeQuestion {
	public static void main(String[] args) {
		
		//Write a program to check whether a temperature is above 30°C, then print "Hot Day".
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature:");
		int temp = sc.nextInt();
		
		if(temp>30) {
			System.out.println("Its a Hot Day.");
		}
		else {
			System.out.println("temperature is mild.");
		}*/
		
		//Write a program to check whether a number is even or odd.
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even.");
		}
		else {
			System.out.println("number is odd.");
		}*/
		
		//Write a program to check whether a given year is leap year or not.
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}*/
		
		//Write a program to check whether a number is positive or negative.
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Number is Positive.");
		}
		else if(num<0) {
			System.out.println("Number is negative.");
		}
		else {
			System.out.println("Number is zero.");
		}*/
		
		//Write a program to print the day of the week based on day number (1–7).
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter day in 1-7:");
		int day = sc.nextInt();
		
		switch(day) {
		case 1: System.out.println("Monday"); break;
        case 2: System.out.println("Tuesday"); break;
        case 3: System.out.println("Wednesday"); break;
        case 4: System.out.println("Thursday"); break;
        case 5: System.out.println("Friday"); break;
        case 6: System.out.println("Saturday"); break;
        case 7: System.out.println("Sunday"); break;
        default: System.out.println("Invalid day");
		}*/
		
		//Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene).
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 sides of triangle:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
            */
		
		//program based on age group
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
        int age = sc.nextInt();
        if (age >= 0 && age <= 12)
            System.out.println("Child");
        else if (age <= 19)
            System.out.println("Teenager");
        else if (age <= 59)
            System.out.println("Adult");
        else
            System.out.println("Senior Citizen");   */
		
		//Write a program to classify a temperature as Hot, Warm, Cool, or Cold.
		/* Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Temperature:");
	        int temp = sc.nextInt();
	        if (temp > 35)
	            System.out.println("Hot");
	        else if (temp > 25)
	            System.out.println("Warm");
	        else if (temp > 15)
	            System.out.println("Cool");
	        else
	            System.out.println("Cold");    */
		
		//Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to Vote");
            if (age >= 25)
                System.out.println("Also eligible to Contest in Elections");
        } else {
            System.out.println("Not eligible to Vote");   
        }       */
		
		//Write a program to check whether a number is even, and if even, check whether it’s greater than 50.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
            if (num > 50)
                System.out.println("Also greater than 50");
        } else {
            System.out.println("Odd");
        }
        

	}

}
