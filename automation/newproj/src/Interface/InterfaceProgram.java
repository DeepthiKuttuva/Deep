package Interface;
interface Ad{
	int a =10;
	int b =20;
	int sum();
	
}
class B implements Ad{
	public int sum() {
		int c=a+b;
		System.out.println("The sum: "+ c);
		return(c);
	}
}

public class InterfaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.sum();

	}

}
