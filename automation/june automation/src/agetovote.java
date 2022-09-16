import java.util.Scanner;

public class agetovote {

	public static void main(String[] args) {
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the age");
		age = s.nextInt();
		if (age == 18 || age > 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible to vote");
		}

	}

}
