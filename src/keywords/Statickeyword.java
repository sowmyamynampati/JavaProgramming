package keywords;

  public class Statickeyword {
	
	static int a= 10;       // static variables 
	  
	  int b=20;           // Non- static 
	  
	  
	  static void m1() {
		  System.out.println(a + ""+ "it is astatic method" );                    // static method 
	  }
	  
	  void m2() {                                    //Non- static method
		  System.out.println(b+ ""+ "it is non-static method"); 
	  }
	  
	  
/*	public static void main(String[] args) {
		m1();        // this is a static method, so no need to create a object
		
		Statickeyword sk= new Statickeyword();
		sk.m2();
		}         */
}
