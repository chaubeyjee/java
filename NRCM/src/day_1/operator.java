package day_1;

public class operator {
	int a=10,b=20;
	static int c=45,d=12;
	void not() {
		int a=67,b=34;
		System.out.println(!(a<b));
	}
	void or() {
		System.out.println((c>d)||(c>=d));
    }
	void and() {
		System.out.println((a<b)&&(a<=b));
	}
	public static void main(String[] args) {
		operator o1=new operator();
		o1.not();
		o1.or();
		o1.and();
	}
}
