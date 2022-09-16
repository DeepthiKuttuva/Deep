package Interface;
//this is multiple inheriance. there are two parent s, one child. so the child class implements two parent clss
interface Parent1{
	void m1();
}
interface Parent2{
	void m2();
}
class child implements Parent1,Parent2{
	public void m1() {
		System.out.println("This is first parent");
	}
	public void m2() {
		System.out.println("This is second parent");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.m1();
		c.m2();
	}

}
