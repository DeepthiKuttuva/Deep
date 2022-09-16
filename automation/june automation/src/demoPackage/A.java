package demoPackage;
abstract class A1{
abstract void m1();
}
public class A extends A1 {
public void m1() {
	System.out.println("abstract");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A obj=new A();
obj.m1();
	}

}
