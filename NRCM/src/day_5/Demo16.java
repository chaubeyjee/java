package day_5;

class sample16 {
	public sample16() {
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}

}
public class Demo16 extends sample16{
	public Demo16() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Demo16 d1=new Demo16();
		d1.show();
	}
}
