package keywords;

public class Thiskeyword {
	
	int x, y;    // class or instance variables
	
/*	Thiskeyword(int a,int b) {             a, b are local variables  
		x=a;
		y=b;
	}   */
	
	void setdata(int x, int y){              /*  we should use this keyword why class local varibales are name */
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
	/*	Thiskeyword tk= new Thiskeyword(2,4);    */
		Thiskeyword  tk= new Thiskeyword();
		tk.setdata(2,4);
		tk.display();
	}
}
