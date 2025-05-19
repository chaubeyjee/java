package day_2;
import java.util.*;
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String color=sc.nextLine();
		switch(color) {
		case "red":
			System.out.println("celebrate holi");
			break;
		case "green":
			System.out.println("celebrate ramzan");
			break;
		case "white":
			System.out.println("celebrate christmas");
			
			break;
			default:
				System.out.println("no festival");
		}
	}

}
