package day_4;

public class Sample8 {
	int a=90;
	public Sample8(int b) {
		b=a;
//		this.a=b;
		System.out.println("good morning"+a);
	}
	public static void main(String[] args) {
		Sample8 s1=new Sample8(45);
		Sample8 s2=new Sample8(40);
		Sample8 s3=new Sample8(44);
	}
}
