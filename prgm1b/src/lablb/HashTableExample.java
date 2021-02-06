package lablb;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(100,"Ramesh");
		ht.put(102,"Rani");
		ht.put(103,"Yojitha");
		ht.put(104,"Tejaswini");
		ht.put(105,"JayaSankar");
		for(Map.Entry m:ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
