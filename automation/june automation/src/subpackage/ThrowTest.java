package subpackage;

public class ThrowTest {

	static void valid(int age) throws ArithmeticException {
		if (age<18) {
			throw new ArithmeticException(" not valid to vote");}
			else {
			System.out.println(" vote");}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//use try and catch to avoid exception
		try {
		valid(78);
		valid(9);}
		catch(ArithmeticException a) {
			System.out.println(a);
			System.out.println("rest of the code");
		}
		

	}

}
