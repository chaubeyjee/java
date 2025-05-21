package Day_8;

public class Multi1 extends Thread {
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Multi1 m1=new Multi1();
		System.out.println("hello");
		m1.start();
	}

}
