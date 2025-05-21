package DAY_7;
public class Exception3 {
	static void add(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("maths radha nike");
		}
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			add(20,0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally{
			System.out.println("all keywords covered");
		}

	}

}
