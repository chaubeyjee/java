//static inner class
package Day_6;

class Hello6 {
	private static void show() {
		System.out.println("hi");
	}
	static class Test5{
		static void print() {
			System.out.println("hello");
			show();
		}
	}
}
public class Hello5 {
	public static void main(String[] args) {
		Hello6.Test5.print();
		
	}
}
