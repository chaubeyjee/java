package day_4;

public class Sample9 {
	int a;
	int b;
	public Sample9(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		Sample9 s1=new Sample9(40,41);
		s1.add();
	}

}
