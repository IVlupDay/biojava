package studyPackage;

import java.util.*;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("apple", "red");
		hashtable.put("strawberry", "red"); 
		hashtable.put("lime", "yellow");
		hashtable.put("orange", "orange");
		
		Enumeration<String> e = hashtable.keys();
		while(e.hasMoreElements()) {
			String k = e.nextElement(); 
			String v = hashtable.get(k); 
			System.out.println("Key "+k+"; Value "+v); 
			
			// Gen the color of fruit 
			System.out.println("The color of apple is");
			String s = hashtable.get("apple");
			System.out.println(s);
		}
	}
}
