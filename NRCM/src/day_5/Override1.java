//compile time polymorphism is called as method overloading
//run time polymorphism is also called as method overriding
package day_5;

 class Override2 {
	 void show() {
		 System.out.println("hi");
	 }

}
 public class Override1 extends Override2{
	 
	 void show() {
		 System.out.println("hello");
	 }
	 public static void main(String[] args) {
		 Override1 o1=new Override1();
		 o1.show();
		 
	 }
 }
