import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		// This shows whether number is positive or negative
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		num = s.nextInt();
		if (num > 0) {
			System.out.println("the number " + num + " is positive");
		}

		else if (num < 0) {
			System.out.println("the number  " + num + " is negative");

		} else {
			System.out.println("the number  " + num + " is neither positive nor negative");

		}
	}

}
