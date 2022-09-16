package Overloading;
//Method overloading is done to achieve polymorphism. the method name is same with different parameters and different datatypes.This is done to save memory and time
public class OverloadingMethods {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	double add(int a,double b) {
		System.out.println(a+b);
		return(a+b);
	}
    void add(double d,double b,int c) {
    	System.out.println(d+b+c);
    }
    void add(int a,String s) {
    	System.out.println(a +s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingMethods m=new OverloadingMethods();
		m.add(1, 2);
		m.add(1, 2.2);
		m.add(1.7, 11.8, 8);
		m.add(1, " Deeps");

	}

}
