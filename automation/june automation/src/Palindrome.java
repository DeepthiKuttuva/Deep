import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int reverse = 0, remainder;

		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int resultnum = num;

		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num /= 10;
		}
		if (resultnum == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
