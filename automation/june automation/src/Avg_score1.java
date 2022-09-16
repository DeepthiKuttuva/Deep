import java.util.Scanner;

public class Avg_score1 {

	public static void main(String[] args) {
		int avg;
		System.out.println("enter the avg score: ");
		Scanner s = new Scanner(System.in);
		avg = s.nextInt();
		if (avg >= 90) {
			System.out.println("the grade is A");
		} else if (avg >= 70 && avg < 90) {
			System.out.println("the grade is B");
		} else if (avg >= 50 && avg < 70) {
			System.out.println("the grade is C");
		} else if (avg < 50) {
			System.out.println("the grade is F");
		}

	}

}
