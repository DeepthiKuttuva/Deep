abstract class Banks{
	abstract int getinterest();
}
class Sbis extends Banks{
	int getinterest() {
		return 9;
	}
}
class Pnb extends Banks{
	int getinterest() {
		return 8;
	}
}
public class TestBank {

	public static void main(String[] args) {
		Sbis s=new Sbis();
		s.getinterest();
		Pnb p=new Pnb();
		p.getinterest();
		Banks obj=new Pnb();
		
		System.out.println(obj.getinterest());
		System.out.println(s.getinterest());
		System.out.println(p.getinterest());
	}

}
