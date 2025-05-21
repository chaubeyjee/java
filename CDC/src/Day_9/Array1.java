//package day_9;
//import java.util.*;
//
//public class Array1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr1[]= {10,6,2,39,87};
//		Arrays.sort(arr1);
//		for(int b1:arr1)
//			System.out.println(b1);
//
//	}
//
//}



package Day_9;
import java.util.*;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,6,2,39,87};
		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr1, 2);
		System.out.println(a);
		for(int b1:arr1)
			System.out.println(b1);
		System.out.println();

	}

}

