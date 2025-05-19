//multilevel inheritance
package day_5;
class Bike{
	void speed() {
		System.out.println("250kn per hour");
	}
}
class Bmw extends Bike{
	void rev() {
		System.out.println("10000c");
	}
}
class Model extends Bmw{
	void price() {
		System.out.println("just 20lakhs");
	}
}

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model b=new Model();
		b.speed();
		b.rev();
		b.price();
	}

}
