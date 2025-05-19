package day_1;

public class Methods {
	int a=10,d=4,c=2;
	static int l=12,b=15,r=5;
	void areaOfCircle() {
		System.out.println(3.14*r*r);
	}
	static void areaOfRectangle() {
		System.out.println(l*b);
	}
	void areaOfSquare() {
		System.out.println(a*a);
	}
	static void areaOfTriangle() {
		int x=8,y=3;
		System.out.println((x*y)/2);
	}
	public static void main(String[] args) {
		Methods m1=new Methods();
		m1.areaOfCircle();
		areaOfRectangle();
		m1.areaOfSquare();
		areaOfTriangle();
	}

}
