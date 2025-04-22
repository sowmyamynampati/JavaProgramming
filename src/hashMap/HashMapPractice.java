package hashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		//declaration
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		//Adding Pairs
		hm.put(101, "John");
		hm.put(102,"Greg");
		hm.put(103,"alexa");
		hm.put(104, "Mathew");
		hm.put(105, "sonam");
		hm.put(106,"John");
		hm.put(107,"stephew");
		
		//Size of the HashMap
		hm.size();
		System.out.println("Size of the HashMap:"+hm.size());
		
		//Print the HashMap
		System.out.println("Print the HashMap:"+hm);
 
		//Remove the keys and values
		hm.remove(106,"John");
		hm.remove(106);
		System.out.println("Remove the keys and values:"+hm);
	
		//insertion to add values to the HashMap ---not Possible
		
		//Access the value of key
		System.out.println("Access the value of key:"+hm.get(107));
		
		//get all the keys from HashMap
		System.out.println("Access the value of key:"+hm.keySet());
		System.out.println("Access the value of key:"+hm.values());
		System.out.println("Access the value of key:"+hm.entrySet());
		
		//change the value or Replace specific key
		hm.put(107,"Junnu");
		System.out.println ("change the value:" +hm);
		
		//read the data from HashMap
		for (Integer x: hm.keySet())
		{
			System.out.println(x);
		}
		
		for (String x: hm.values())
		{
			System.out.println(x);
			}
		
		for (Entry <Integer,String> x: hm.entrySet())
		{
			System.out.println(x);
			}
		
	}

}
