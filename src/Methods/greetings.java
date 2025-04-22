package Methods;

public class greetings {
	
	//no parameters  no return value
	void m1() {
		System.out.println("Hello");
	}
	
	//no parameter    Return value
	String m2() {
		return("how are you doing");
	}
	
	//Parameter      Return value
	String m3(String name) {
		return("hey:" +name);
	}
	
	//Paratemer    no return value
	void  m4(String name){
		System.out.println("Hello:"+name);
	}

}
