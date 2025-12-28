package com.static1;

public class Demo {                  //never static only but inner class can be static
	
	         static String name="rahul";
	         int age;
	         String city;
	         
	         
	         //constructor
		        Demo(){      //when object is created
		        	System.out.println("Demo constructor");
		        }
	         
	         static {                       // executes once only when class loads 
	        	 System.out.println("This is static block");
	         }
	          
	         {                             // executes every time when object is created before constructor
	        	 System.out.println("Non-static");
	         }
	        public static void display() {
	        	 System.out.println("This is Static Method");
	         }
	        
	       
             public static void main(String[] args) {          
            	 Demo d = new Demo();
            	 Demo d1 = new Demo();
				    Demo.display();
				    
				    
				    
			}
}
