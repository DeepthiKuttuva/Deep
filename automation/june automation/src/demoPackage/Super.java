package demoPackage;

class Animals{
	String s="Animal kingdom";
	void sound() {
		System.out.println("animals make sound.");
	}

void eat() {
	System.out.println("Animals eat");
}
Animals(){
	System.out.println("animals have legs");
}

}
class Dogs extends Animals{
Dogs(){
	super();
	System.out.println("Dogs have 4 legs");
	
}
	void sound() {
		System.out.println(super.s);
	super.sound();
		System.out.println("dogs make bow bow sound");
		super.eat();
		System.out.println("dogs eat bones");
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animals obj=new Animals(4);
		Dogs d=new Dogs();
		d.sound();
		
		
		
		

	}

}
