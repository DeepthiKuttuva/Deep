package Methods;

public class StaticMethod {
	int a=2;
	static int b=10;
	void m1() {
		System.out.println("m1-non static");
	}
	static void m2() {
		System.out.println("m2- static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);//static varaible can be called directly
         m2();//static methods dont require object creation
       //  System.out.println(a); cannot call directly as it s not static

		StaticMethod s=new StaticMethod();
		s.m1();
		System.out.println(s.a);

	}

}
