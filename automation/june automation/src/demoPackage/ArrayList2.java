package demoPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< String> list=new ArrayList<String>();
		list.add("Deepthi");
		list.add("Venkat");
		list.add(0,"Prachu");
		list.add(1,"Adhu");
		list.remove(2);
		System.out.println(list);//keep elements in square brackets
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		Iterator<Integer> itr1=list1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("The name at position 1 is : " +list.get(1));
		System.out.println("the number at positon 2 is : "+list1.get(2));
		System.out.println("the array size of integers is : "+list1.size());
		System.out.println("The array list with numbers before adding elements : ");
		for(int currentInteger:list1) {
			System.out.println("the arraylist number is : " +currentInteger);}
		
		list1.add(0,21);
		list1.add(3,88);
		list1.add(5,78);
		System.out.println("The arrayList after adding elements :");
		for(int currentInteger:list1) {
			System.out.println("The arraylist number is : "+currentInteger);
			
		}
		System.out.println("The arraylist with old names");
		for(String name1:list) {
			System.out.println("the name is "+name1);
		}
			list.add(3,"Ramesh");
			list.add(1,"Deepthi");
			list.add(4,"Anandhi");
			list.add(2,"Sushmi");
			System.out.println("the new name arraylist : ");
         for(String name1:list) {
        	 System.out.println("The name is " +name1);
         }
		}
	}


