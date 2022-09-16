package ArrayList;

import java.util.ArrayList;

public class ArrayListMultipleDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		//duplicates are allowed in Arraylist
		list.add(1);
		list.add("Deep");
		list.add('D');
		list.add(33.8);
		System.out.println(list.size());
		System.out.println("The elements are :"+list );
		// to read this arraylist , we should use Object type. here variable is stored as object
		for(Object i:list) {
			System.out.println(i);
		}

	}

}
