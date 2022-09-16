package Hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashmap has key value pairs
    HashMap<Integer,String> hm = new HashMap<Integer,String>();
    //to add values in key value pair
    hm.put(1, "deep");
    hm.put(2, "venk");
    hm.put(3, "prach");
    hm.put(4, "prach");
    System.out.println(hm.size());
    System.out.println(hm);
    hm.remove(2);
	
	// reading values in a loop
	for(Entry<Integer, String> m:hm.entrySet()) {
		System.out.println(m.getKey() +" " +m.getValue());
	}

}}

