import java.util.*;

public class VectorIterator {

//	enumeration works
	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<Integer>();

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
		
		Enumeration<Integer> e = list.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}
