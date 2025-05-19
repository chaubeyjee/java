//package day_2;
//
//public class Pattern {
//	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			for (int j=1;j<=5;j++) {
//				System.out.print("* ");
//				
//			}
//			System.out.println(" ");
//		}
//	}
//
//}
//using while loop
package day_2;

public class Pattern {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
				System.out.print("* ");
				j+=1;
			}
			i+=1;
			System.out.println();
		}
	}
}