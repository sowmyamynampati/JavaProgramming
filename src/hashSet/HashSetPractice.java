package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
	
public static void main(String[] args) {
	//Declaration
	HashSet<Object>myset= new HashSet<Object>();
	//Set myset= new HashSet();
	//HashSet<String>myset= new HashSet<String>();
	
	//adding elements to Hashset
	myset.add("Advaith");
	myset.add(24);
	myset.add(0.9);
	myset.add(true);
	myset.add("Java");
	myset.add("Selenium");
	myset.add('A');
	myset.add(24);
	myset.add(null);
	//print all the elements
	System.out.println(myset);
	
	//remove the element . here not index concept. give direct value
	myset.remove(24);
	System.out.println("after removing the element:" + myset);
	
	// Insertion element - not possible
	// Access the specific element - not possible
	
	//Convert HashSet -- ArrayList
	ArrayList al= new ArrayList(myset);
	System.out.println(al);
	System.out.println(al.get(3));
	
	//read all the elements using for each loop. Through normal for loop we can't read data because we don't have Index concept in Hashset
	
	for(Object x:myset) {
		System.out.println(x);
	}

	//using Iterator
	Iterator<Object> it= myset.iterator();
	
		while(it.hasNext())
		{
			System.out.println(it);	
			}
	}
	}
