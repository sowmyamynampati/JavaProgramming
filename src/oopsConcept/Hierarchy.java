package oopsConcept;

class Parent{
	int d;
	void display() {
		System.out.println(d);
	}
}
class child1 extends Parent{
	int e;
	void print(char c) {
		System.out.println(e);
	}
}
class child2 extends Parent{
	int f;
	void show() {
		System.out.println(f);
	}
}
public class Hierarchy {
	public static void main(String[] args) {
		child1 ch= new child1();
		ch.print('e');
		ch.display();
		child2 ch1= new child2();
		ch1.show();
		}
	}
