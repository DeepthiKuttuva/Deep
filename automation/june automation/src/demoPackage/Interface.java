package demoPackage;
//import String;

interface  Interface1 {
void m1();
void m2(int a);
void m3(String s);
}
public class Interface implements Interface1{
public	void m1() {
		System.out.println("this is sample interface");
	}
public void m2(int a) {
	System.out.println("the value of a is "+a);
	
}
public void m3(String s)
{
	System.out.println("All methods are "+s);
}
	public static void main(String[] args) {
		Interface1 obj=new Interface();
		obj.m1();
		obj.m2(4);
		obj.m3("abstract");

	}

}
