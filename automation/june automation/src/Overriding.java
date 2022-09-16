
class Bank {
	
	int getInterest() {
		return 0;
	}
}

class Sbi extends Bank{
	
	int getInterest() {
		return 8;
	}
}

class Axis extends Bank {
	int getInterest() {
		return 7;
	}
}

class Icici extends Bank {
	int getInterest() {

		System.out.println("the interest is high");
		return 9;
	}
}

public class Overriding {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		System.out.println("The interest rate for Sbi is " + s.getInterest());
		Axis a = new Axis();
		System.out.println("The interest rate for Axis is " + a.getInterest());
		Icici i = new Icici();
		System.out.println("The interest rate for Icici is " + i.getInterest());
		// i.getInterest();

	}

}
