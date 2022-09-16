package subpackage;
class A{
	//private int a =40;
 public  void m() {
	System.out.println("This is Parent class");
}
}
class B extends A{
	void m1() {
		System.out.println("This is child class");
	}
	B(){
		System.out.println("child constructor");
	}
}
class C extends A{
	public void m1() {
		System.out.println("this is 2nd child");
	}
	C(){
		System.out.println("another constructor");
	}
}
public class Hierarchial_interference {
 public void m2() {
	 System.out.println("this is method under child class" );
 }
 public Hierarchial_interference(){
	 System.out.println("we can use it in another package");
 }
	public static void main(String[] args) {
		Hierarchial_interference obj=new Hierarchial_interference();
        C obj1=new C();
        obj1.m1();
        B obj2=new B();
        obj2.m1();
        obj2.m();
        obj.m2();
        //A object =new A();
        //System.out.println(object.a);
	}

}
