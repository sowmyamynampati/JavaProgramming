package oopsConcept;

public class Encapsulation {
	
// variables should be private
	private int acct;
	private String acctname;
	private String Bankname;
	
// methods , every variables should have two methods, set and get
	void setAcct (int acc) {
		acct=acc;                             /*  if you want to put the both namessame use   this.acct= acct*/
		}
	int getAcct() {
		return acct;
	}
	void setacctname(String acctname) {
		this.acctname= acctname;                  /* if you want to create setters and getters click on the Source option goto generate
		                                                   setters and getters */
		}
	
	String getname() {
		return acctname;
	}
	
	public static void main(String[] args) {
		Encapsulation en= new Encapsulation();
		en.setAcct(100);
		System.out.println(en.getAcct());
		
		en.setacctname("Advaith");
		System.out.println(en.getname());
		}
}
