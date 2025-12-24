package com.accesss;

public class AccessDemo {

    //  Instance Variables
    public int a = 10;
    protected int b = 20;
    int c = 30;           // default
    private int d = 40;
    
    

    //  Constructors
    public AccessDemo() {
        System.out.println("Public Constructor");
    }

    protected AccessDemo(int x) {
        System.out.println("Protected Constructor");
    }

    AccessDemo(String s) {
        System.out.println("Default Constructor");
    }

    private AccessDemo(double y) {
        System.out.println("Private Constructor");
    }

    
    
    // Methods
    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
    

    // Accessing ALL members inside SAME CLASS
    public void accessInsideClass() {
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c);  
        System.out.println(d); 

    }
    
    public static void main(String[] args) {
		
    	AccessDemo obj = new AccessDemo();
    	AccessDemo obj1 = new AccessDemo(33);
    	AccessDemo obj2 = new AccessDemo("Monika");
    	AccessDemo obj3 = new AccessDemo(12344556);
    	
    	System.out.println();
    	obj.publicMethod();
    	obj. protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
    	
	}
}

