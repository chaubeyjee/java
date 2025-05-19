package Day_6;

 class Test1 {
	 void show() {
		System.out.println("hi");
	}
 }
 public class Hello2 extends Test1{
	 void show(){
		int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}
 
	public static void main(String[] args) {
		Hello2 h1=new Hello2();
		h1.show();
	}

 }
