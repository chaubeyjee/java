//multipath inheritance
package day_5;
class Fruits{
	void benefits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits{
	void color() {
		System.out.println("red");
	}
}
class Banana extends Fruits{
	void taste() {
		System.out.println("sweet");
	}
}
class Mango extends Fruits{
	void price() {
		System.out.println("200kg");
	}
}


public class Demo12 {
	public static void main(String[] args) {
		Apple a= new Apple();
		Mango m=new Mango();
		Banana b=new Banana();
		a.benefits();
		a.color();
		m.price();
		b.taste();
	}
}
