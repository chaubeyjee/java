package Day_9;
import java.util.*;

public class Linked1 {
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.addFirst(0);
		l1.addLast(80);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(80);
		l1.remove(2);
		System.out.println(l1);
		
		
	}

}
