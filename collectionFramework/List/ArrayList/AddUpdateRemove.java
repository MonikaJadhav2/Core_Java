package com.tka;

import java.util.ArrayList;

// Add, Update, and Remove Elements from a List
public class AddUpdateRemove {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// Add elements
        list.add(5);
        list.add(15);
        list.add(25);

        System.out.println("Original List: " + list);

        
        //update list
        list.set(1, 10);
        
        System.out.println("Updated list : " + list);
        
        //delete element
        list.remove(1);
        
        System.out.println("After deleting element of index 1: " +list);
	}
}
