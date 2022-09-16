package JumpStatements;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;// if we use break , numbers after that condition wont be printed
			}
		}

	}

}
