package arrayList;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListPractice{

	public static void main (String[] args) {
		//Declaration
		ArrayList<Object>mylist = new ArrayList<Object>();
				// List mylist= new ArrayList();
		      //ArrayList<integer>mylist= new ArrayList<integer>();
				
				//adding data into arraylist
				mylist.add("Advaith");
				mylist.add("A");
				mylist.add(100);
				mylist.add(10.1);
				mylist.add("null");
				mylist.add("null");
				mylist.add("Advaith");
				//size of the array
				System.out.println("size of an arraylist:" + mylist.size());
				//print the arraylist
				System.out.println("print all the elements in array:" +mylist);
				//remove the element  4 is the index 
				mylist.remove(4);   
				System.out.println("After removing:" +mylist);
				//insert the elements
				mylist.add(4,"Junnu");
				System.out.println("After insertion:" +mylist);
				//Modify or replacement or change
				mylist.set(1,"Java");
				System.out.println("After modification:"+mylist);
				//Access the specific element
				System.out.println("After access the specific element:"+mylist.get(6));
				
				//reading all the elements in array
				//use for loop, for each loop, Iterator is using only for collections
				
				//for loop
				for(int i=0;i<mylist.size(); i++) {
				System.out.println(mylist.get(i));
					
				}
				//for each loop
				for(Object x: mylist) {
				System.out.println(x);
				}
				
				//Iterator
				Iterator<Object> it = mylist.iterator();
				{
					while(it.hasNext()) {
						System.out.println(it.next());
				}
					
				//check the arraylist is empty or not
					System.out.println("is empty:" +mylist.isEmpty());
					
					//remove the multiple elements in arraylist
					ArrayList<Object> mylist2= new ArrayList<Object>();
					mylist2.add("Java");
					mylist2.add("null");
					mylist.removeAll(mylist2);
					System.out.println("After removing all the elements:" +mylist);
					//all the elements clear
					mylist.clear();
					System.out.println("is empty:" +mylist.isEmpty());
				}
				}
}
