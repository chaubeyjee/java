package Day_8;

class Test7 extends Thread {
	public void run() {
		System.out.println("kaisa hai");
	}
}
class Test4 extends Test7{
	public void run() {
		System.out.println("hi Rahul Bhai");
	}
}
class Test5 implements Runnable{
	public void run() {
		System.out.println("kaisa hai bihar ka mausam");
	}
}
class Test6 extends Test5{
	public void run() {
		System.out.println("kab araha hai?");
	}
}
public class Rahul1{
	public static void main(String[] args) {
		Test4 t1=new Test4();
		Test7 t2=new Test7();
		Test5 t3=new Test5();
		Test6 t4=new Test6();
		t1.start();
		t2.start();
		Thread t5 =new Thread(t3);
		t5.start();
		Thread t7=new Thread(t4);
		t7.start();
	}
}