package Interface;
interface A{
	int a=10;//variables in interface are  static and final
	void m1();//methods in interface are always abstract.Methids are public by default in interface
		
}
class Test implements A{
	public void m1() {// we should include the access modifier when a class implements interface
		System.out.println("The value of a is:"+a);
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();//we cannpt create object for interface, we can just create reference variable fpr interface but not object
		t.m1();

	}

}
