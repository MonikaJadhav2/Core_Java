package com.hset;
import java.util.*;

public class SetSize {

	
	public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

        System.out.println("Size of Set: " + set.size());
    }
}
