package FinalKeyword;
class Finalmethod{
	final void display() { // final keyword when we use for a method we cannot override that method in the child class
		System.out.println("final method");
	}
}
class Finalmethod1 extends Finalmethod {
	void display() {
		System.out.println("final method cannot be overridden");
	}
}
public class Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
