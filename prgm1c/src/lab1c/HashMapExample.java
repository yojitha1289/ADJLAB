package lab1c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put("Ramesh", new Double(3434.34)); 
		hm.put("Rani", new Double(123.22));
		hm.put("Yojitha", new Double(1378.00));
		hm.put("Tejaswini", new Double(99.22));
		hm.put("Jayasankar", new Double(-19.08));
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
		 Map.Entry me = (Map.Entry)i.next();
		 System.out.print(me.getKey() + ": ");
		 System.out.println(me.getValue());
		}
		 System.out.println();
		 double balance = ((Double)hm.get("Ramesh")).doubleValue();
		 hm.put("Ramesh", new Double(balance + 1000));
		 System.out.println("Ramesh's new balance: " +
		 hm.get("Ramesh"));
		 } 


}
