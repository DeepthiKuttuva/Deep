package subpackage;
import demoPackage.A7;
public class A8 {
private String p="prachu";
protected int members(int a)  {
	System.out.println("the number of members in my family is "+a );
	
	
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String w="world";
System.out.println(w);
A7 obj=new A7();
obj.display();
System.out.println(obj.s);
System.out.println(obj.s.concat(" morning"));
System.out.println("hello ".concat("world"));

System.out.println(obj.s1);
System.out.println(w.equals("s1"));
A8 obj1=new A8();
obj1.members(4);

System.out.println(obj1.p);
System.out.println(obj.s1 +" and peacocks");

	}

}
