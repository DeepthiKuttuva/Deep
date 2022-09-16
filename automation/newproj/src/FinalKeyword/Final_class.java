package FinalKeyword;
final class Bank{// if a class is final then we cannot be extended  to another class.
	void show() {
		System.out.println("bank is created");
	}
}
class SBI extends Bank{
	void show() {
		System.out.println("sbi is created");
	}
}
public class Final_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
