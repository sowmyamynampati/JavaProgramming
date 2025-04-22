package Methods;

public class greetingsMain {
	public static void main(String[] args) {
	greetings  gs=new greetings();
	gs.m1();
	String s= gs.m2();
	System.out.println(s);
	String var=gs.m3("Advaith");
	System.out.println(var);
	 gs.m4("Junnu");
	}
}