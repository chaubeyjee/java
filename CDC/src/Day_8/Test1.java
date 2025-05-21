package Day_8;

class Test2 extends Thread {
	public void run() {
		System.out.println("hi");
	}

}
class Test3 implements Runnable{
	public void run() {
		System.out.println("good morning");
	}
}
class Test1{
	public static void main(String[] args) {
		Test2 t1= new Test2();
		Test3 t2=new Test3();
		//system.out.println("hello");
		t1.start();
		Thread t3=new Thread(t2);
		t3.start();		
	}
}
