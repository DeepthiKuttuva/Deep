
public class Final_keyword {
	final int a = 1;

	 void m1() {
		 a = 60;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Final_keyword obj = new Final_keyword();
		obj.m1();
	}

}
