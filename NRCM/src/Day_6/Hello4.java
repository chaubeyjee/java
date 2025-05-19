//method local inner class
package Day_6;

public class Hello4 {
	void show() {
		System.out.println("good afternoon");
		class Test4{
			void print() {
				System.out.println("hello");
			}
		}
		Test4 t1=new Test4();
				t1.print();
	}
	public static void main(String[] args) {
		Hello4 h1= new Hello4();
		h1.show();
	}

}
