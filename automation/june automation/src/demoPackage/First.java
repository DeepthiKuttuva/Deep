package demoPackage;
//import subpackage.B;
import subpackage.Hierarchial_interference;
import subpackage.Forloop;
public class First extends Hierarchial_interference  {
	
 public void method() {
	 System.out.println("first is in demopackage");	 
 }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      First object=new First();
      object.method();
      object.m2();
      //Hierarchial_interference obj=new Hierarchial_interference();
     // obj.m2();
      Forloop obj1=new Forloop();
    //  obj1.forloop();(method is private)
     // B obj2=new B();
      //obj.m1();
	}

}
