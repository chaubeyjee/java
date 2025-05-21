package Day_9;
import java.util.*;

public class Collection4 {
		public static void main(String[] args ) {
			List<Object> l1=new ArrayList<Object>();
			l1.add(10);								
			l1.add("hi");
			l1.add("Rahul");
			l1.add(40);
			System.out.println(l1);
			List<Object> extra=Arrays.asList(9,6,7);
			l1.addAll(extra); //for first position use (1,extra)
			System.out.println(l1);//for particular index use(l1.get(6))
			System.out.println(l1.indexOf("Rahul"));
			Object [] arr=l1.toArray();
			for(Object a1:arr) {
				System.out.println(a1);
			}
		}
}
