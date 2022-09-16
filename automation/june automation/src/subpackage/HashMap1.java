package subpackage;
import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(100,"Deep");
hm.put(101, "Sushmi");
hm.put(102, "Adhu");
hm.put(103,"Prachu");
System.out.println(hm);
System.out.println(hm.get(100));
System.out.println("After invoking put()method");
for(Map.Entry m:hm.entrySet()) {
	System.out.println(m.getKey()+" " +m.getValue());
}
hm.putIfAbsent(104, "Ramesh");
System.out.println("after invoking putIfAbsent() method");
for(Map.Entry m:hm.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	
}
hm.put(105, "Sushmi");
for(Map.Entry m:hm.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	}
HashMap<Integer,String> hm1=new HashMap<Integer,String>();
hm1.put(106,"Anandhi");
hm1.putAll(hm);
System.out.println("After invoking putAll() method");
for(Map.Entry m:hm1.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}

}}
