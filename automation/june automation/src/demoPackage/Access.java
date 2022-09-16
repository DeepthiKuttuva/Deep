package demoPackage;
//Public/default,abstract and final can be used before class.private and protected ant be given class name
public class Access {
private int a=90;

private void m1() {//private method
	System.out.println("private method");
	
}
int m2(int a) {//default method
	System.out.println("there are" +a+ " access specifiers");
	return 4;
} 
protected void m2() {
	System.out.println("protected method");
}
protected String m3(String b)	{
	//String b="protected";
	System.out.println(b);
	return b;
		
	
	}
static void m4() {
	System.out.println("static method");
}

	public static void main(String[] args) {
		Access obj=new Access();
		System.out.println(obj.a);
		// a=90;//cannot modify private data member
		obj.m1();
		obj.m2(4);
		 obj.m2();
		 obj.m3("protected");
		 m4();//we call static method without classname too
		 
	}

}

