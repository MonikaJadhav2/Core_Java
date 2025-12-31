package com.string1;

public class StringBuilders {
	public static void main(String[] args) {

		String s1 = "java";
		String s3 = "java";
		String s2 = new String("java");

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s2));

		System.out.println(s1.hashCode() == s2.hashCode()); // contains same data stored in one memory at scp

		String s = "Hello";
//		s = s + " world";                  string concatination using +
//		System.out.println("s:" +s);

		// inbuilt method concat()
		s = s.concat(" World");
		String s4 = "Hello";

		System.out.println("concat() result of s : " + s);
		System.out.println("s4:" + s4);

		System.out.println(s.hashCode());
		System.out.println(s4.hashCode());

//       StringBuilder
//		StringBuilder sb = new StringBuilder("hello");           //  thread safe
//		System.out.println(sb);
//      sb.append(" world");
//		System.out.println(sb.hashCode());

		StringBuffer sb = new StringBuffer("hello");          //thread no safe

		sb.reverse();
		System.out.println(sb.charAt(3));
		System.out.println(sb);

		
		String s5 = "bob";
		StringBuffer sb1 = new StringBuffer(s5);   
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);

//		if(s5.equals(sb1)) {                                //always returns false
		if (s5.equals(sb1.toString())) {                    //need toString cause s5 is string and sb1 is stringBuffer
			System.out.println("String is palidrome");
		} else {
			System.out.println("String is not palindrome");
		}

		System.out.println(sb1.length());
		System.out.println(sb1.capacity());      //capacity= default(16) + slength

		System.out.println(sb1.isEmpty());        //checks slength==0

	}
}
