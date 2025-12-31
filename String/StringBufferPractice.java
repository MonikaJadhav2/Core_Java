package com.string1;

public class StringBufferPractice {

	public static void main(String[] args) {

//		1)Create a StringBuffer and append your name.
		StringBuffer sb = new StringBuffer("I am ");
		sb.append("Monika");
		System.out.println("Updated String: " + sb);
		System.out.println();

//	2)	Insert "Programming" inside "I Love " using StringBuffer.
		StringBuffer sb1 = new StringBuffer("I Love ");
		System.out.println("Before Inserting : " + sb1);
		sb1.append(" Programming");
		System.out.println("After inserting : " + sb1);
		System.out.println();

//	3)	Reverse a string using StringBuffer.
		String s = "Monika";
		StringBuffer sb2 = new StringBuffer("I am ");
		System.out.println("Before Reverse : " + sb2);
		sb2.reverse();
		System.out.println("After Reverse : " + sb2);
		System.out.println();

//	4)	Delete last 3 characters using StringBuffer.
		StringBuffer sb3 = new StringBuffer("Developer");
		System.out.println("String before: " + sb3);
		sb3.delete(2, 5);
		System.out.println("String after deleting the three characters : " + sb3);
		System.out.println();

//	5)	Replace "India" with "Bharat" using StringBuffer.
		StringBuffer sb4 = new StringBuffer("India");
		System.out.println("String before replacing: " + sb4);
		sb4.replace(0, 5, "Bharat");
		System.out.println("String after replacing: " +sb4);
		System.out.println();

//	6)	Print length and capacity of StringBuffer.
		StringBuffer sb5 = new StringBuffer("Developer");
		System.out.println("StrinBuffer Length  : " + sb5.length());
		System.out.println("StringBuffer Capacity : " + sb5.capacity());
		System.out.println();

//	7)	Convert StringBuffer to String.
		StringBuffer sb6 = new StringBuffer("Monika");
		System.out.println("String buffer to String : " + sb6.toString() );

	}

}
