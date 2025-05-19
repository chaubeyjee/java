//interface
//package day_5;
// 
//interface I1{
//	abstract void add(); 
//		void sub();
//	
//}
//	public class Demo15 implements I1{
//		public void add() {
//		System.out.println("hi");
//	}
//	public void sub() {
//		System.out.println("hello");
//	}
//	public static void main(String[] args) {
//		Demo15 c=new Demo15();
//		c.add();
//		c.sub();
//	}
//	
//
//}
package day_5;
 
interface I1 {
	 
		void add();
	
}
interface I2 {
	 
		void sub();
	
}
	public class Demo15 implements I1,I2{
		public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Demo15 c=new Demo15();
		c.add();
		c.sub();
	}
	

}
