import java.util.Scanner;

public class Arithmetics {

	public static void main(String[] args) {

		// This program is to perform various arithmetic operations
		int a;
		int b;
		System.out.println("enter 1st number");
		System.out.println("enter 2nd number");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("The result of adding is " + (a + b));
		System.out.println("The result of subtracting is " + (a - b));
		System.out.println("The result of multiplying is " + (a * b));
		System.out.println("The result of dividing is " + (a / b));
		System.out.println("The result of modulus is " + (a % b));

	}

}
