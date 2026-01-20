package com.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
// import java.io.FileNotFoundException; 

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(123, "monika", "pune");

		FileOutputStream file = new FileOutputStream("D:\\HTML\\employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);

		oos.writeObject(e); //cretae //insert operation done
		
		oos.close();
		file.close();
		
		System.out.println("File is created...!");
	}
}
