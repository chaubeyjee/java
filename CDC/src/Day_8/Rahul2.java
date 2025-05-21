package Day_8;

public class Rahul2 extends Thread {
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
public static void main(String[] args) {
	Rahul2 r2=new Rahul2();
	for(int i=0;i<=10;i++) {
		System.out.println(i);
		
	}
	r2.start();
}
}
