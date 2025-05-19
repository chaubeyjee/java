package day_2;

public class Iterative1 {
	public static void main (String[] args) {
	String list[]= {"apple","banana","imli"};
	for(String x:list) {
		System.out.println(x);
	}
	for(int i=2;i<=20;i++) {
	int count=0;
	for(int j=2;j<=i;j++) {
		if(i%j==0) {
			count+=1;
		}
	}
		if(count==1) {
			System.out.println(i);
		}
			
	}
}
}

