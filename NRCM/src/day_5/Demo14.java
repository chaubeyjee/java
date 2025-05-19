//compile time polymorphism
//package day_5;
//
//public class Demo14 {
//	void show() {
//		System.out.println("hlo how are you?");
//		
//	}
//	 void show(int a,int b) {
//		 System.out.println(a+b);
//	 }
//	 void show(double d1,double d2) {
//		 System.out.println(d1+d2);
//	 }
//	 void show(String s1,String s2) {
//		 System.out.println(s1+s2);
//	 }
//	 public static void main(String[] args) {
//		 Demo14 d=new Demo14();
//		 d.show();
//		 d.show(10,20);
//		 d.show(2.3,4.2);
//		 d.show("prabhakar","chaubey");
//		 
//		 }
//	 }
//
//main method can overload but cannot override
package day_5;

public class Demo14 {
	public static void main() {
		System.out.println("hlo how are you?");
		
	}
	public static void main(int a,int b) {
		 System.out.println(a+b);
	 }
	public static void main(double d1,double d2) {
		 System.out.println(d1+d2);
	 }
	public static void main(String s1,String s2) {
		 System.out.println(s1+s2);
	 }
	 public static void main(String[] args) {
		 
		 main();
		 main(10,20);
		 main(2.3,4.2);
		 main("prabhakar","chaubey");
		 
		 }
	 }

