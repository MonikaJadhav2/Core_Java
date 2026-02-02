package monika;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;

		System.out.println("Enter 5 numbers:");

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<5; i++) {
			sum= sum+arr[i];
		}
		
		
		System.out.println("Sum of array elements:" +sum);
		
		sc.close();
	}
}
