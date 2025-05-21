//package day_8;
//import java.util.*;
//
//public class Collection1 {
//	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<Integer>();
//		l1.add(10);
//		l1.add(20);
//		l1.add(30);
//		l1.add(40);
//		System.out.println(l1);
//		Iterator i1=l1.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//	}
//}


//using List Iterator

//package day_8;
//import java.util.*;
//
//public class Collection1 {
//	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<Integer>();
//		l1.add(10);
//		l1.add(20);
//		l1.add(30);
//		l1.add(40);
//		System.out.println(l1);
//		ListIterator i1=l1.listIterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		while(i1.hasPrevious()) {
//			System.out.println(i1.previous());
//		}
//	}
//}
package Day_8;
import java.util.*;

public class Collection1 {
	public static void main(String[] args) {
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}
		
	}
}
