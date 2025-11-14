package com.demo;

public class OperatorPracticeQuestion {
	public static void main(String[] args) {

		        // 1
		        int a1 = 10;
		        a1 += 5;
		        a1 -= 3;
		        a1 *= 2;
		        a1 /= 4;
		        System.out.println("1: " + a1);

		        // 2
		        int a2 = 5, b2 = 10, c2 = 15;
		        System.out.println("2: " + ((a2 < b2) && (b2 < c2)));

		        // 3
		        System.out.println("3-1: " + ((a2 > b2) || (b2 < c2)));
		        System.out.println("3-2: " + (!(a2 < c2)));

		        // 4
		        int x4 = 10, y4 = 20;
		        System.out.println("4: " + (x4++ + ++y4));

		        // 5
		        int a5 = 5, b5 = 2;
		        System.out.println("5: " + (a5 % b5));

		        // 6
		        int p6 = 7, q6 = 3;
		        System.out.println("6: " + (p6 * q6 + p6 / q6));

		        // 7
		        int n7 = 5;
		        System.out.println("7: " + (++n7 + n7++));

		        // 8
		        int x8 = 5, y8 = 10;
		        System.out.println("8: " + (x8 > y8 ? x8 : y8));

		        // 9
		        int a9 = 10, b9 = 5, c9;
		        c9 = a9++ + --b9 + a9 * b9;
		        System.out.println("9: " + c9);

		        // 10
		        int a10 = 4, b10 = 2;
		        System.out.println("10: " + (a10 << b10));

		        // 11
		        int a11 = 8, b11 = 2;
		        System.out.println("11: " + (a11 >> b11));

		        // 12
		        int a12 = 10;
		        System.out.println("12: " + (~a12));

		        // 13
		        int a13 = 5, b13 = 7;
		        System.out.println("13: " + (a13 & b13));

		        // 14
		        int a14 = 5, b14 = 7;
		        System.out.println("14: " + (a14 | b14));

		        // 15
		        int a15 = 5, b15 = 7;
		        System.out.println("15: " + (a15 ^ b15));

		        // 16
		        int a16 = 10;
		        System.out.println("16: " + (a16++ + ++a16 + a16--));

		        // 17
		        int a17 = 1;
		        a17 += a17++ + ++a17;
		        System.out.println("17: " + a17);

		        // 18
		        int a18 = 5, b18 = 10;
		        boolean result18 = (a18 < b18) ? true : false;
		        System.out.println("18: " + result18);

		        // 19
		        int a19 = 5, b19 = 10;
		        System.out.println("19: " + (a19 == b19));

		        // 20
		        int a20 = 3, b20 = 2;
		        System.out.println("20: " + (a20 * b20 + a20 / b20));

		        // 21
		        int a21 = 5;
		        a21 = a21++ + ++a21;
		        System.out.println("21: " + a21);

		        // 22
		        int a22 = 10, b22 = 5;
		        System.out.println("22: " + (a22 > b22 && a22 != b22));

		        // 23
		        int x23 = 2, y23 = 3;
		        x23 *= (y23 + 1);
		        System.out.println("23: " + x23);

		        // 24
		        int a24 = 5;
		        a24 += a24 -= a24 *= a24;
		        System.out.println("24: " + a24);

		        // 25
		        int a25 = 4, b25 = 3;
		        System.out.println("25: " + (a25 > b25 ? a25++ : ++b25));

		        // 26
		        int a26 = 5;
		        System.out.println("26: " + (a26++ + a26++ + ++a26));

		        // 27
		        int a27 = 2, b27 = 3;
		        System.out.println("27: " + (a27 + b27 * a27 / b27));

		        // 28
		        int a28 = 10, b28 = 20;
		        System.out.println("28: " + (a28 < b28 && b28 > a28));

		        // 29
		        int a29 = 6, b29 = 2;
		        System.out.println("29: " + ((a29 / b29) * (a29 % b29)));

		        // 30
		        int a30 = 5, b30 = 10, c30 = 15;
		        System.out.println("30: " + ((a30 < b30 && b30 > c30) || !(b30 < c30)));
		    }

}
