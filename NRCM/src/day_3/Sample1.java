package day_3;

public class Sample1 {
	public static void main (String[] args) {
	String s1= "rahul";
	String s2= "rahul";
	String s3=new String("rahul");
	String s4=new String("rahul");
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	System.out.println(s3.equals(s4));
	System.out.println(s3==s4);
	System.out.println(s2.equals(s4));
	System.out.println(s1.compareTo(s4));
	
	}

}
