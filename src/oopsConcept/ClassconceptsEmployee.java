package oopsConcept;

public class ClassconceptsEmployee {
	
	//variables
	int empid;
	String empname;
	int empsal;
	String jobtitle;
	
	//Methods
	void display() {
		System.out.println("Employee ID:"  +empid);
		System.out.println("Employee name:"  +empname);
		System.out.println("Employee salary:"  +empsal);
		System.out.println("Employee JOb Describtion:"  +jobtitle);
		System.out.println("-----------------------------------");
		}
	
	public static void main(String[] args) {
		
	/*	ClassconceptsEmployee emp= new ClassconceptsEmployee();
		emp.empid= 101;
		emp.empname= "Advaith";
		emp.empsal= 300;
		emp.jobtitle= "Testing";    */
		
		// creating multiple objects
		
		ClassconceptsEmployee emp1= new ClassconceptsEmployee();    
		emp1.empid= 101;
		emp1.empname= "Advaith";
		emp1.empsal= 300;
		emp1.jobtitle= "Testing";
		emp1.display();
		
		ClassconceptsEmployee emp2= new ClassconceptsEmployee();
		emp2.empid= 102;
		emp2.empname= "Junnu";
		emp2.empsal= 301;
		emp2.jobtitle= "Automation";
		emp2.display();
		}
        }
