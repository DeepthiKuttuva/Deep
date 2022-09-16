package Overloading;

public class OverloadingConstructor {
	OverloadingConstructor(int a,int b){
		System.out.println(a+b);
	}
	OverloadingConstructor(double d,double e,int c){
		System.out.println(d+e+c);
	}
	OverloadingConstructor(String s,String t){
		System.out.println(s+t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingConstructor ov= new OverloadingConstructor(1,2);
		OverloadingConstructor ovc =new OverloadingConstructor(1.1,2.3,4);
		OverloadingConstructor over =new OverloadingConstructor("Welcome","Deepthi");

	}

}
