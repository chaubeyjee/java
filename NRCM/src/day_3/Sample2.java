//abstraction in java
package day_3;

abstract class Test4 {
	abstract void add();
	abstract void sum();
	abstract void show();
	abstract void display();

}
class Sample2 extends Test4{
	public void  add() {
		System.out.println("hi");
	}
	public void sum() {
		System.out.println("hello");
	}
	public void show(){
		System.out.println("Im prabhakar chaubey");
	}
	public void display() {
		System.out.println("rahul is my bestfriend");
	}
	 
	public static void main(String[] args) {
		Sample2 dl= new Sample2();
		dl.add();
		dl.sum();
		dl.show();
		dl.display();
	}
}
