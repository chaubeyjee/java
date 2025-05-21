//package day_9;
//import java.util.*;
//
//public class Collection2 {
//	public static void main(String[] args ) {
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


//package day_9;
//import java.util.*;
//
//public class Collection2 {
//	public static void main(String[] args ) {
//		List<Integer> l1=new ArrayList<Integer>();
//		l1.add(10);
//		l1.add(20);
//		l1.add(30);
//		l1.add(40);
//		List<Integer> l2=new ArrayList<Integer>(l1);
//		l2.add(5);
//		l2.add(6);
//		l2.add(7);
////	l2.addAll(l1);
///		l2.add(null)
//		System.out.println(l2);
////		Iterator i1=l1.iterator();
////		while(i1.hasNext()) {
////			System.out.println(i1.next());
////		}		
//	}
//}
//package day_9;
//import java.util.*;
//
//public class Collection2 {
//	public static void main(String[] args ) {
//		List<Object> l1=new ArrayList<Object>();
//		l1.add(10);									//using object we can allow strings also
//		l1.add("hi");
//		l1.add("Rahul");
//		l1.add(40);
//		System.out.println(l1);
////		Iterator i1=l1.iterator();
////		while(i1.hasNext()) {
////			System.out.println(i1.next());
////		}		
//	}
//}

package Day_9;
import java.util.*;

public class Collection2 {
	public static void main(String[] args ) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(10);									//using object we can allow strings also
		l1.add("hi");
		l1.add("Rahul");
		l1.add(40,"kumar");
		System.out.println(l1);
	}
}
		
		
		
		
		
