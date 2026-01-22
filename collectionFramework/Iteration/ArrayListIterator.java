import java.util.*;

public class ArrayListIterator {

	public static void main(String[] args) {
		
//		to iterarte:
//		1. iterator  --> it work for set also
//		2. listIterator   -->for list only
//		3. Enumeration but dont work for arraylist only work for lragcy classes->Vector
		
		
//		4. foreach loop
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(11);
		list.add(12);
		list.add(1);
		list.add(12);
		list.add(123);
		
//		System.out.println(list);
		
//      1. Iterator
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//	    2. listIterator	
//		ListIterator<Integer> litr = list.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
		
		for (Integer integer : list) {
			System.out.println(integer);
		}

//		List<Integer> list1 = new ArrayList<Integer>();
//
//		list1.add(10);
//		list1.add(11);
//		list1.add(12);
//		list1.add(1);
//		list1.add(12);
//		list1.add(123);
//		
//		list1.addAll(list);
		
//		System.out.println(list1);
		
//		for (Integer s : list) {
//			System.out.println(s);
//		}
//		
	}
}
