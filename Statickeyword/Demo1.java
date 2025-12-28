package com.static1;

public class Demo1 {
	
	 int id;
     String name;
     static String instituteName ="TKA";        //static belongs to class not object 
     
     Demo1(int id , String name){
    	 this.id =id;
    	 this.name =name;
//    	 Demo1.instituteName = "XYZ";        //valid
//    	 this.instituteName ="2345";        //invalid
     }
     
     void display() {
//    	 Demo1.instituteName = "ABC";      //modify static using class name
    	 System.out.println("id :" + id);
    	 System.out.println("name = " + name);
    	 System.out.println("institutename : " + instituteName);
     }

}
