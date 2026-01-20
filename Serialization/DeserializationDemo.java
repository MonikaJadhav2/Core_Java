package com.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception{
		
		FileInputStream file = new FileInputStream("D:\\HTML\\employee.txt");
//		FileInputStream file = new FileInputStream("D:\\HTML\\student.txt");
		ObjectInputStream ois = new ObjectInputStream(file);
		
		Employee e = (Employee) ois.readObject();
		
		System.out.println(e.empId + " " + e.name + " " + e.city);
		
		file.close();
		ois.close();
	}
}
