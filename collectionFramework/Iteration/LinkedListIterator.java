import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;
import java.util.*;

public class LinkedListIterator {

//	enumeration dont works
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(11);
		list.add(12);
		list.add(1);
		list.add(12);
		list.add(123);
		
//		System.out.println(list);
				
//		for (Integer y : list) {
//			System.out.println(y);
//		}
		
//      1. Iterator
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//	    2. listIterator	
		ListIterator<Integer> litr = list.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
//		3. enumerator
//		Enumeration<Integer> e = list.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
	}
}
