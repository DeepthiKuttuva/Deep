package Overloading;

public class MainMethodOverloading {
	void main(int a,int b) {
		System.out.println(a+b);
	}
	void main(int a,String s) {
		System.out.println(a+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMethodOverloading m=new MainMethodOverloading();
		//m.main(null);
		m.main(1, 7);
		m.main(1, "hi");

	}

}
