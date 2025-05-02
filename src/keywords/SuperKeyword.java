package keywords;

class Animal{
	String color=" white";
}

class Dog extends Animal{
	String color="black";
	
	void display() {
		System.out.println(color);         /*  	System.out.println(Super.color);*/
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();

	}

}
