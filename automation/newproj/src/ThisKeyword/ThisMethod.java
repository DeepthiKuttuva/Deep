package ThisKeyword;

public class ThisMethod {
	int a;//these a and b are class variables /instance variables
	int b;
	void getValues(int a,int b) {//The variables inside method are method variables
		//This keyword is used along with class varaibles, if we want both the class varaiables and method varaibles to be same. Every variable occupies memory, in order to save memory, we are using This keyword
		//if this is not used then values will be zero, compiler will not understand which is class varaible and which is method varaible
		this.a=a;
		this.b=b;
		
	}
	void Print() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod th =new ThisMethod();
		th.getValues(1, 2);
		th.Print();
	}

}
