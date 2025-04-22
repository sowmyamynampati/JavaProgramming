package Methods;

public class ConstructorDemo {
	
	int a, b;
	
	ConstructorDemo()    // default Constructor
	{
	a=10;
	b=20;
	}

	ConstructorDemo(int x, int y)    // Parameterized Constructor
	{
		a=x;
		b=y;
		
	}

	void sum() {
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		 ConstructorDemo  cd= new ConstructorDemo ();   // default COnstructor
		ConstructorDemo  cd1= new ConstructorDemo ();  // parameterized 
		 cd1.sum();  
		 
	}

	
}
