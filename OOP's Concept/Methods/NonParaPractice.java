package com.method;

public class NonParaPractice {
	// 1. Square of fixed number
	public int square() {
		int n = 5;
		return n * n;
	}

	// 2. Cube
	public int cube() {
		int n = 3;
		return n * n * n;
	}

	// 3. Sum
	public int sum() {
		int a = 10, b = 20;
		return a + b;
	}

	// 4. Greatest of three
	public int greatest() {
		int a = 10, b = 50, c = 30;
		return (a > b && a > c) ? a : (b > c ? b : c);
	}

	// 5. Even check
	public boolean isEven() {
		int n = 8;
		return n % 2 == 0;
	}

	// 6. Factorial
	public int factorial() {
		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
		return fact;
	}

	// 7. Reverse
	public int reverse() {
		int n = 1234;
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}

	// 8. Prime
	public boolean isPrime() {
		int n = 11;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// 9. Count digits
	public int countDigits() {
        int n = 98765;
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
}
}
