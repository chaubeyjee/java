//package day_8;
//
//public class Multi2 implements Runnable {
//	public void run() {
//		System.out.println("hi");
//	}
//	public static void main(String[] args) {
//		Multi2 m1=new Multi2();
//		Thread m2=new Thread(m1);
//		System.out.println("hello");
//		m2.start();
//	}
//
//}
//package day_8;
//
//public class Multi2 implements Runnable {
//	public void run() {
//		System.out.println("hi");
//	}
//	public static void main(String[] args) {
//		Multi2 m1=new Multi2();						//this is using multithreading
//		Multi2 m2=new Multi2();
//		
//		Thread p1=new Thread(m1);
//		Thread p2=new Thread(m2);
//		System.out.println("hello");
//		p1.start();
//		p2.start();
//	}
//
//}
package Day_8;

public class Multi2 implements Runnable {
	public void run() {
		System.out.println("hi");
	}											//this is the normal method 
	public static void main(String[] args) {
		Multi2 m1=new Multi2();
		Multi2 m2=new Multi2();
		System.out.println("hello");
		m1.run();
		m2.run();
	}

}
