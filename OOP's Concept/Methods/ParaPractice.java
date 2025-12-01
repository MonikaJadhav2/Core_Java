package com.method;

public class ParaPractice {
	
	// 1. Square of a number
	public int square(int n) {
		return n * n;
	}

	// 2. Cube of a number
	public int cube(int n) {
		return n * n * n;
	}

	// 3. Sum of two numbers
	public int sum(int a, int b) {
		return a + b;
	}

	// 4. Greatest of three numbers
	public int greatest(int a, int b, int c) {
		return (a > b && a > c) ? a : (b > c ? b : c);
	}

	// 5. Check even or odd
	public boolean isEven(int n) {
		return n % 2 == 0;
	}

	// 6. Factorial of a number
	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	// 7. Reverse of a number
	public int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}

	// 8. Prime check
	public boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// 9. Count digits
	public int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
}
}