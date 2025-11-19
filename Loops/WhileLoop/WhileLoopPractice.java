import java.util.*;

public class WhileLoopPractice {
	public static void main(String[] args) {

		System.out.println("Numbers from 1 to  10:");
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		System.out.println("Numbers from 10 to 1 :");
		int b = 10;
		while (b >= 1) {
			System.out.println(b);
			b--;
		}

		System.out.println("Even numbers from 1 to 50:");
		int c = 1;
		while (c <= 50) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			c++;
		}

		System.out.println("Odd numbers from 1 to 50:");
		int d = 1;
		while (d <= 50) {
			if (a % 2 == 1) {
				System.out.println(d);
			}
			d++;
		}

		System.out.println("Table Of 5:");
		int i = 1;
		while (i <= 10) {
			System.out.println(" 5 * " + i + " = " + (5 * i));
			i++;
		}

		System.out.println("Table of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 1;
		while (j <= 10) {
			System.out.println(n + " * " + c + " = " + (n * c));
			j++;
		}

		System.out.println("Print Hello 10 Times;");
		int k = 1;
		while (k <= 10) {
			System.out.println("hello");
			k++;
		}

		System.out.println("sum of first 10 natural number:");
		int sum = 0;
		int u = 1;
		while (u <= 10) {
			sum += u;
			u++;
		}
		System.out.println("sum = " + sum);

		System.out.println("Sum of even numbers from 1 to 100 :");
		int sumEven = 0;
		int f = 1;
		while (f <= 100) {
			if (f % 2 == 0) {
				sumEven += f;
			}
			f++;
		}
		System.out.println("Sum= " + sumEven);

		System.out.println("Sum of odd numbers from 1 to 100 :");
		int sumOdd = 0;
		int g = 1;
		while (g <= 100) {
			if (g % 2 == 1) {
				sumOdd += g;
			}
			g++;
		}
		System.out.println("Sum= " + sumOdd);

	}

}
