import java.util.*;

public class DoWhilePractice {
	public static void main(String[] args) {

		System.out.println("Numbers from 1 to  10:");
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}while (a <= 10);

		System.out.println("Numbers from 10 to 1 :");
		int b = 10;
		do{
			System.out.println(b);
			b--;
		}while (b >= 1) ;

		System.out.println("Even numbers from 1 to 50:");
		int c = 1;
		do {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			c++;
		}while (c <= 50);

		System.out.println("Odd numbers from 1 to 50:");
		int d = 1;
		do {
			if (a % 2 == 1) {
				System.out.println(d);
			}
			d++;
		}while (d <= 50);

		System.out.println("Table Of 5:");
		int i = 1;
		do{
			System.out.println(" 5 * " + i + " = " + (5 * i));
			i++;
		}while (i <= 10) ;

		System.out.println("Table of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 1;
		 do{
			System.out.println(n + " * " + c + " = " + (n * c));
			j++;
		}while (j <= 10);

		System.out.println("Print Hello 10 Times;");
		int k = 1;
		do {
			System.out.println("hello");
			k++;
		}while (k <= 10);

		System.out.println("sum of first 10 natural number:");
		int sum = 0;
		int u = 1;
		do {
			sum += u;
			u++;
		}while (u <= 10);
		System.out.println("sum = " + sum);

		System.out.println("Sum of even numbers from 1 to 100 :");
		int sumEven = 0;
		int f = 1;
		do {
			if (f % 2 == 0) {
				sumEven += f;
			}
			f++;
		}while (f <= 100);
		System.out.println("Sum= " + sumEven);

		System.out.println("Sum of odd numbers from 1 to 100 :");
		int sumOdd = 0;
		int g = 1;
		do {
			if (g % 2 == 1) {
				sumOdd += g;
			}
			g++;
		}while (g <= 100);
		System.out.println("Sum= " + sumOdd);

	}

}
