package oopsConcept;

public class OverloadingMainMethod {
	
	void main(int x) {
		System.out.println(x);
	}

    void main(String s1) {
	System.out.println(s1);
		}

    void main(String s1, String s2) {
	System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		 OverloadingMainMethod ol= new  OverloadingMainMethod();     /* Yes, we can overlaod the main method but the parametrs are different.*/
		 ol.main(40);
		 ol.main("Advaith");
        ol.main("Advaith", "Junnu");
	}

}
