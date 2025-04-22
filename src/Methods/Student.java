package Methods;

public class Student {
	
int	id;
String name;
char grad;

//How many ways we can store data into variables:

void display() {
	
	System.out.println(id+" "+name+" "+grad);
}

void setdisplay(int stuid, String  stuname, char gr)  {
	id= stuid;
	name= stuname;
	grad= gr;
	}

Student(int stuid, String  stuname, char gr){
	id= stuid;
	name= stuname;
	grad= gr;
}

}
