//to get a particular target element
//package day_3;
//
//public class Array1 {
//	public static void main(String[] args) {
//		int a[] = {23,45,56,78};
//		int t=2;
//		System.out.println(a[t]);
//		}
//}

//max and min value
package day_3;
public class Array1 {
 public static void main(String[] args) {
		int a[] = {23,45,56,78};
		int min=a[0];
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		if(a[i]>max) {
			max=a[i];
		}	
		}
	System.out.println(min);
	System.out.println(max);
}
}

