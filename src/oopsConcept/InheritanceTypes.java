package oopsConcept;

class A{                     /* Single Inheritance */
	int a =10;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	int b=20;
	void show() {
		System.out.println(b);
	}
}
	class C extends B{                /* multi level Inheritance */
		int c=30;
		void print() {
			System.out.println(c);
		}
	}
	public class InheritanceTypes {
	
public static void main(String[] args) {
		/* B childb= new B();
	System.out.println(childb.a);
		System.out.println(childb.b);        
		 childb.display();
		 childb.show(); */
	
		 C multiIn= new C();
		 multiIn.a=10;
		 multiIn.b=20;
		 multiIn.c=30;
		multiIn.display();
		multiIn.show();
		multiIn.print();
		 
	}
}

