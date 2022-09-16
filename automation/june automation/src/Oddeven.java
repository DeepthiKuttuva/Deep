
import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// This program is to check if the given number is odd or even

		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		num = s.nextInt();

		if (num % 2 == 0) {
			System.out.println("number " + num + " is even");

		} else {
			System.out.println("the number " + num + " is odd");
		}
	}

}
