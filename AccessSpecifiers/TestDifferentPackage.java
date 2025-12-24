package com.finaltopic;


import com.accesss.AccessDemo;

public class TestDifferentPackage {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();   // ✔ public constructor

        System.out.println(obj.a);  // ✔ public
        // System.out.println(obj.b); ❌ protected
        // System.out.println(obj.c); ❌ default
        // System.out.println(obj.d); ❌ private

        obj.publicMethod();         // ✔
        // obj.protectedMethod(); ❌
        // obj.defaultMethod(); ❌
        // obj.privateMethod(); ❌
    }
}


