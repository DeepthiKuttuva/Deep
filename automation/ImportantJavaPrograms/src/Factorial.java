
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int i,fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);	
	}

}
