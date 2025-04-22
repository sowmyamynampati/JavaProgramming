package oopsConcept;

public class ConstructorOverloading {
	
	double width, length, height;
	
	ConstructorOverloading (){     //1 
		/* width= 0;
		length=0;
		height=0;   */
		width=length=height=0 ;
		}
	
  ConstructorOverloading(double w, double l, double h){     //2
	  width= w;
	  length=l;
	  height=h;
	 }
	
  ConstructorOverloading(double len){           //3
	  width=length=height=len;
	  
  }
  
  void display() {
	  System.out.println("Width: " + width + ", Length: " + length + ", Height: " + height);	
		
	}
  
	public static void main(String[] args) {
		
		 ConstructorOverloading co= new  ConstructorOverloading();        //1
		 ConstructorOverloading co1= new  ConstructorOverloading(10.2, 10.3, 10.4);      //2
		 ConstructorOverloading co2= new  ConstructorOverloading(10.2);         //3
		co.display();
		co1.display();
		co2.display();
			}
}
