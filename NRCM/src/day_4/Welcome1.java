package day_4;

public class Welcome1 {
	int x,y,z;
	public Welcome1() {
		System.out.println("this is my profile");
	}
	public Welcome1(int ssc) {
		this.x=ssc;
		System.out.println("ssc marks:" +x);
	}
	public Welcome1(int ssc,int inter) {
		this.x=ssc;
		this.y=inter;
		System.out.println("ssc marks:"+x+" inter marks:" +y);
	}
	public Welcome1(int ssc,int inter,int btech) {
		this.x=ssc;
		this.y=inter;
		this.z=btech;
		System.out.println("ssc marks:"+x+" inter marks:"+y+" btech marks:"+z);
	}
	public static void main(String[] args) {
		Welcome1 w1=new Welcome1();
		Welcome1 w2=new Welcome1(100);
		Welcome1 w3=new Welcome1(100,87);
		Welcome1 w4=new Welcome1(100,87,90);
	}

}
