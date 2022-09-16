package Exception;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 9 / 0;
		} catch (Exception ae) {
			System.out.println(ae);
			System.out.println("handling arithmetic exception");
		}
		
			finally {
				//System.out.println(ae);
				System.out.println("rest of the code");
				
			}
try {
	String s=null;
	System.out.println(s.length());
} 
catch(NullPointerException n) {
	System.out.println(n);
	System.out.println("exception handled");
}
	
	try {
		String s="abc";
		int i= Integer.parseInt(s);
	}
	catch(NumberFormatException nf) {
		System.out.println(nf);
		System.out.println("this exception is handled");
	}
	
	try {
		int a[]= {1,2,3,4,5};
		a[6]=0;
	}
	catch(ArrayIndexOutOfBoundsException ai) {
		System.out.println(ai);
	   System.out.println("Array exception is handled");	
	}

}
}