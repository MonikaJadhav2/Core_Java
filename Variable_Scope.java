package com.demo;

public class Variable_Scope {
	
	    
	    // Global variables
	    int age = 20;                  
	    static String college = "ACEM"; 

	    public void showDetails() {
	        // Local variable
	        String name = "Monika";

	        System.out.println("Local Variable: " + name);
	        System.out.println("Global Instance Variable: " + age);
	        System.out.println("Global Static Variable: " + college);
	    }

	    public static void main(String[] args) {
	        Variable_Scope obj = new Variable_Scope();
	        obj.showDetails();
	    }


}
