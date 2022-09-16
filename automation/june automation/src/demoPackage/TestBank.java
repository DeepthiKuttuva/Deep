package demoPackage;
abstract class Bank1{
	abstract int getinterest();
	void display() {
		System.out.println("this is non abstract method");
	}
}
class S extends Bank1{
	int getinterest(){return 7;}
}
class P extends Bank1{
	int getinterest() {
		return 6;
	}
}
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
S s=new S();
s.getinterest();
System.out.println("the interest is "+s.getinterest()+"%");
s.display();
P p=new P();
System.out.println("the interest rate for pnb is " +p.getinterest() +"%");
	}

}
