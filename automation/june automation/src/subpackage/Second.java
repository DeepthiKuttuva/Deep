package subpackage;
import demoPackage.First;
public class Second {
 int m(int a) {
	 System.out.println(a);
	 return 8;
 }
	public static void main(String[] args) {
		System.out.println("this is in subpackage and we are importing First class from demoPackage");
   First object=new First();
   object.method();
   Second obj=new Second();
   obj.m(8);
	}

}
