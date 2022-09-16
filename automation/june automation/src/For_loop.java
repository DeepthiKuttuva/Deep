
public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The first ten numbers");

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {

				continue;
			}
			System.out.println(i);
		}
	}

}
