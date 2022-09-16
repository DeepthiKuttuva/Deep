import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		int num;
		int reverse=0;
	
		
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		StringBuilder sb=new StringBuilder(reverse);

		// StringBuilder sb=new StringBuilder("Hello");  
		 sb.reverse();
		while (num != 0) {
			int digit = num % 10;
	 reverse=reverse * 10 + digit;
	 //StringBuilder sb=new StringBuilder(reverse);

	// StringBuilder sb=new StringBuilder("Hello");  
	// sb.reverse();
			num /= 10;
			  
			
		}
		System.out.println("the reverse number:" +reverse);

	}
}
