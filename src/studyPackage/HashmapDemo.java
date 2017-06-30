package studyPackage; 

import java.util.*;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap(); 
		hm.put("zara", new Double(3434.34)); 
		hm.put("Manhz", new Double(123.23));
		hm.put("Ayan", new Double(2323.23));
		hm.put("Daisy", new Double(12.11));
		hm.put("Qadir", new Double(139.23));
		Set set = hm.entrySet();
		Iterator i = set.iterator(); 
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
			}
		System.out.println();
		Double balance = ((Double)hm.get("zara")).doubleValue();
		hm.put("Zara", new Double(balance+1000));
		System.out.println("Zara's new balance");
		hm.get("Zara");
	}	
}