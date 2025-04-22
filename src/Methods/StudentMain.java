package Methods;

public class StudentMain {

	public static void main(String[] args) {
		
		//1.using object reference variables
	/*	Student stu= new Student();
		stu.id= 10;
		stu.name= "Junnu";
		stu.grad='A';
		stu.display();  */
		
	/*	//2. using method
		stu.setdisplay(11, "Advaith", 'B');    */
		
		
		//Using Constructor most of the times we used constructor concept only 
		Student stu= new Student(12, "Adhirth", 'C');

		stu.display();

	}

}
