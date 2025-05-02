package oopsConcept;
/*achieve the ploymorphisim with the help of overloading */

public class OverloadingConcept {
	
	int a=1,  b=2;
 void sum() {
	System.out.println(a+b);
}
	
void sum(int x, int y) {
	System.out.println(x+y);
}

void sum(int x, int y, float z) {
	System.out.println(x+y+z);
}

void sum(double s, float d) {
	System.out.println(s+d);	
}
	
	public static void main(String[] args) {
		
		OverloadingConcept oc= new OverloadingConcept();
		oc.sum();
		oc.sum(10, 20);
		oc.sum(1, 5, 105f);
		oc.sum(10.5, 100f);
	}

}
