package com.accesss;

//accessing from another class 

public class TestAccess {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();   // ✔ public constructor
        System.out.println();

        System.out.println(obj.a); //  public   accessible
        System.out.println(obj.b); //  protected   accessible
        System.out.println(obj.c); //  default  accessible
        // System.out.println(obj.d);    private (NOT accessible)
        System.out.println();

        obj.publicMethod();     //accessible
        obj.protectedMethod();  // accessible
        obj.defaultMethod();    // accessible
        // obj.privateMethod();  //NOT accessible
    }
}

