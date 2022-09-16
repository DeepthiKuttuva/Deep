package subpackage;

public class Exception {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 9 / 0;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("handling arithmetic exception");
		}
		finally {
			System.out.println("finally will be executed if exceeption is handled or even not handled");
		}
		try {
		  String s = null;
		  System.out.println(s.length());
		}
		catch(NullPointerException st) {
			System.out.println(st);
			System.out.println("Handling null pointer exception");
			
			
		}
		try {
			String d="abc";
			int i=Integer.parseInt(d);
		}
		catch(NumberFormatException nf) {
			System.out.println(nf);
			System.out.println("Handling NumberFormatException");
		}
		try {
			int a[]= {6,8,9,0,7,5};
			a[10]=90;
		}
		catch(ArrayIndexOutOfBoundsException ab) {
		
		System.out.println(ab);
		System.out.println("Handling array bounds exception");
		
		}
		finally {
			System.out.println("execute the code");
		}
		try {
			String p="my name is deepthi";
			System.out.println(p.charAt(20));
		}
		catch(StringIndexOutOfBoundsException si) {
		System.out.println(si);	
		System.out.println("Handling string bounds exception");
		
		}
		finally {
			System.out.println("one finally block is allowed for one try block");
		}
		
		
		
		
		
		

}
}