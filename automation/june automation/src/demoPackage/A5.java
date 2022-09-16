package demoPackage;

public class A5 {
	 private int a=45;
	 protected int g=90;
public void display() {
	System.out.println("hello");
}
public int age(int a) {
	System.out.println("the age is" +a);
	return a;
}

protected String name(String s) {
	System.out.println("my name is "+s);
	return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5 obj1=new A5();
		obj1.display();
	 String d="deepthi";
	 System.out.println(obj1.a);
	 System.out.println(d);
	
	 
		
//String s="hello";
//System.out.println(s);
	}

}
