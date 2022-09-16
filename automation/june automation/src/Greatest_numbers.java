import java.util.Scanner;
public class Greatest_numbers {

	public static void main(String[] args) {
		// This program shows greatest of 3 numbers
	int a,b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first number");
	System.out.println("Enter the second number");
	System.out.println("Enter the third number");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if(a>b && a>c)
	{
		System.out.println(""+a+" is greatest of 3 numbers");
	}
	else if(b>c && b>a)
	{
		System.out.println(""+b+" is greatest of 3 numbers");
	}
	else
	{
		System.out.println(""+c+" is the greatest of 3 numbers");
	}
 
	}

}
