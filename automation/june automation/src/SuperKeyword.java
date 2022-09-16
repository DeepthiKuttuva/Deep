class Animals{
	void sound() {
		System.out.println("animals make sound.");
	}
}
class Dogs extends Animals{
	void sound() {
	super.sound();
		System.out.println("dogs make bow bow sound");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d=new Dogs();
		d.sound();
		

	}

}
