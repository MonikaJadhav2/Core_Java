import java.util.Scanner;

public class ForLoopPractice {
	public static void main(String[] args) {
		System.out.println("Numbers from 1 to  10:");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("Numbers from 10 to 1 :");
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}

		System.out.println("Even numbers from 1 to 50:");
		for (int k = 1; k <= 50; k++) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
		}
		
		System.out.println("Odd numbers from 1 to 50:");
		for(int a=1; a<=50; a++) {
			if(a%2==1) {
				System.out.println(a);
			}
		}
		
		System.out.println("Table Of 5:");
		for(int b = 1; b<=10; b++) {
			System.out.println("5 * " + b + " = " + (5*b));
		}
		
		System.out.println("Table of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int c = 1; c<=10; c++) {
			System.out.println(n + " * " + c + " = " + (n*c));
		}
		
		System.out.println("Print Hello 10 Times;");
		for(int d = 1; d<=10; d++) {
			System.out.println("hello");
		}
		
		System.out.println("sum of first 10 natural number:");
		int  sum = 0;
		for (int e = 1; e<=10 ; e++) {
			sum += e ;
		}
		System.out.println("sum = " + sum);
		
		System.out.println("Sum of even numbers from 1 to 100 :");
		int sumEven = 0;
		for(int f = 1; f<=100; f++) {
			if(f%2==0) {
				sumEven += f ;
			}
		}
		System.out.println("Sum= " + sumEven);
		
		System.out.println("Sum of odd numbers from 1 to 100 :");
		int sumOdd = 0;
		for(int g = 1; g<=100; g++) {
			if(g%2==1) {
				sumOdd += g ;
			}
		}
		System.out.println("Sum= " + sumOdd);

	}

}
