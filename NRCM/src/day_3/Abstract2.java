package day_3;

 class FixedAmount {
	public int fixedamount=10000;
}
abstract class withdrawal{
	abstract void withdraw(int amount);
}
public class Abstract2 extends withdrawal{
	FixedAmount f1=new FixedAmount();
	
	void withdraw(int amount) {
		f1.fixedamount-=amount;
		System.out.println("withdraw:" + amount);
		System.out.println("available balance:" + f1.fixedamount);
	}
	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		Abstract2 d=new Abstract2();
		d.withdraw(amount);
	}

}
