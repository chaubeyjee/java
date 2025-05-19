//package day_2;
//
//public class Demo1 {
//	public static void main(String[] args) {
//	int a=11;
//	if(a%2==0) {
//		System.out.println("satisfy");
//	}
//	else {
//		System.out.println("not satisfy");
//	}
//}
//}
package day_2;
public class Demo1{
	public static void main (String[] args) {
		int n=9;
		if (n%2==0) {
			System.out.println("satisfied with 2");
		}
		else {
			if(n%3==0) {
				System.out.println("satisfied with 3");
			}
			else {
				System.out.println("not satisfied with 3");
			}
		}
	}
}