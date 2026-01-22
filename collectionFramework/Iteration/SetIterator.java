
import java.util.*;

public class SetIterator {

	public static void main(String[] args) {

//		HashSet<Integer> set = new HashSet<Integer>();
//		TreeSet<Integer> set = new TreeSet<Integer>();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		set.add(10);
		set.add(11);
		set.add(12);
		set.add(1);
		set.add(12);
		set.add(123);

//			System.out.println(list);

		System.out.println(set);
		
//		for (Integer y : list) {
//			System.out.println(y);
//		}
		
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
		
//		3. enumerator
//		Enumeration<Integer> e = list.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
	}
}
