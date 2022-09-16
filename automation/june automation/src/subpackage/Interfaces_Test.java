package subpackage;
import demoPackage.Interfaces;

/*interface Birthday{
	void birth();
}*/
interface Birthday {
	void birth();
}
interface Interfaces2 extends Birthday   {
	void food();
	
}

//class Interfaces_Test extends Interfaces{
class Interfaces_Test1 implements Interfaces2 {
public void birth() {
	System.out.println("my birthday is on july 9th");
	System.out.println("venkat's birthday is on june 3rd");
	System.out.println("prachitha's birthday is june 17th");
	System.out.println("adhu's birthday is on feb 1st");
}
public void food() {
	System.out.println("we like cakes");
	
}}
public class Interfaces_Test extends Interfaces{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces_Test1 obj1=new Interfaces_Test1();
		Interfaces obj=new Interfaces();
		obj1.food();
		obj1.birth();
		obj.gender();
		obj.kids("prachu "," adhu ");
		obj.head("Venkat");
		obj.members();
		
		

	}

}
