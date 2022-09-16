package subpackage;
import demoPackage.A;
public class E extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   E obj1=new E();
   obj1.m1();//(make method m1 in A as public otherwise not visible inthis package)
	}

}
