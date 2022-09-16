package ArrayList;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array has 2 disadvantages. The size is fixed and it cannot include multiple datattypes.To overcome this we use Arraylists.
		ArrayList<String> list =new ArrayList<String>();//ArrayList is a class and list is an object
		list.add("Deep");
		list.add("Venkat");
		list.add("xyz");
		list.add("Prach");
		list.add("Adhu");
		System.out.println(list.size());
		System.out.println("The names are :"+list );
		list.remove(2);
		System.out.println(list.size());
		System.out.println("The names are :"+list );
		list.add(1,"fdfefef");// To insert values we use add method
		System.out.println(list.size());
		System.out.println("The names are :"+list );
		for(String s:list) {
			System.out.println(s);
		}
		
		

	}

}
