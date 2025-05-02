package oopsConcept;
/* we can achieve the overriding concept with the help of inheritence and using extends keyword  */

class Bank{
	double roi() {
		return 0;
	}
}

class Hdfc{
	double roi() {
		return 10.5;
	}
}

class SBI{
	double roi() {
		return 11;
	}
}

public class Overridingconcept {
public static void main(String[] args) {
		Hdfc hd= new Hdfc();
		System.out.println (hd.roi());
		SBI  sb = new SBI();
		System.out.println (sb.roi());
}
}
