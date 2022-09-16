package demoPackage;

import subpackage.Hierarchial_interference;

public class Hello {

	public static void main(String[] args) {
		
		Hierarchial_interference obj=new Hierarchial_interference();
		obj.m2();
		
		
		System.out.println("Hello world");
		System.out.println("Hello \n World");
		System.out.println("Hello \t World");
		String s = "Hello World";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		

	}

}
