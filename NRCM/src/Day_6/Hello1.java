//this keyword
package Day_6;

public class Hello1 extends Object {
	int a=89;
	void add() {
		int a=80;
		System.out.println(a);
		}
	void sub() {
		System.out.println(this.a);
		this.add();
	}
	public static void main(String[] args) {
		Hello1 h1=new Hello1();
		h1.add();
		h1.sub();		
	}
}
