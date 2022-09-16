package mypackage;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		//arithmetic operators
		System.out.println(" ---ARITHMETIC OPERATORS");
		System.out.println("addition value is:" +(a+b));
		System.out.println("subtraction value is:" +(a-b));
		System.out.println("mul value is:" +(a*b));
		System.out.println("division value is:" +(a/b));
		System.out.println("mod value is:" +(a%b));
		//reltional operators
		System.out.println("-----RELATIONAL OPERATORS-----");
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println("-----LOGICAL OPERATORS-----");
		//these work for boolean values
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println();
		System.out.println("---INCREMENTAL OPERATORS");
		 a=12;
		 a++;
		 b=8;
		 b--;
		System.out.println(a);
		System.out.println(b);
	}

}
