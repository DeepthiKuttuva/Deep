package subpackage;
import demoPackage.A5;
public class A6 extends A5 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="world";
		
		
		A6 obj=new A6();
		obj.display();
		
		System.out.println(s1);
	     System.out.println(s1.concat(" deep"));
	     System.out.println(obj.g);
	     obj.age(32);
	     obj.name("Deepthi");
	     obj.getClass();
	     int b=78;
	 	int i=9;
	     System.out.println(b+i);
	    
	     
		
	}

}
