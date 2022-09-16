package Interface;
//It is  a  comination of multiple inheritance and hierarchial inheritance. I t includes both interfa
class A1{
	void m1() {
		System.out.println("Method from class A1");
	}
}
interface B1{
	void m2();
}
interface C1{
	void m3();
}
public class HybridInheritance extends A1 implements B1,C1 {
	public void m2() {
		System.out.println("method from interface B1");
	}
    public void m3() {
    	System.out.println("method from interface C1");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridInheritance h =new HybridInheritance();
		h.m1();
		h.m2();
		h.m3();

	}

}
