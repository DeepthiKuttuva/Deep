package subpackage;
import demoPackage.Pack;
public class MyPack {
	//even without extends keyword we can import from pack and at that time create parent object and call method with that parent object.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pack obj=new Pack();
		obj.display();
		//MyPack oj1=new MyPack();//if we use extends keyword we can create object for child class and with child clas object call the parent method
		//oj1.display();

	}

}
