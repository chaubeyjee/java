//nested inner class
package Day_6;

public class Hello3 {
	void show() {
		System.out.println("Hi");
	}
	class Test3{
		void print() {
			System.out.println("Hellow");
		}
	}

	public static void main(String[] args) {
		Hello3 h1=new Hello3();
		h1.show();
		// TODO Auto-generated method stub
		Hello3.Test3 t1=new Hello3().new Test3();
		t1.print();
	}

}
