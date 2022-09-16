package Inheritance;
//Here there is only parent or base class and there is one child/derived class.
class A{
	int a;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	int b;
	void show() {
		System.out.println(b);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Here class B acquires all the properties from Class A. So if we create object for Class B we can access both class A and Class B variable and methods.
	   B objb =new B();
	   objb.a=10;
	   objb.b=2;
	   objb.display();
	   objb.show();
		

	}

}
