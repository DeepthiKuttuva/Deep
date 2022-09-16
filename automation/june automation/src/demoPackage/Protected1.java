package demoPackage;
//import String;

class Pro{
	protected void m1() {
		System.out.println("Parent class is Pro and method is protected");
		
	}
	protected String s="DEEP";
	private double d=90.88;
}
class Protected1 extends Pro {
private int a=90;//private we can use within same class
Protected1(){
	System.out.println("constructor");
}
protected void method() {
	System.out.println("Protected method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected1 obj=new Protected1();
		obj.a=20;
		System.out.println(obj.a);
		obj.method();
		obj.m1();
		System.out.println(obj.s);
        //System.out.println(obj.d);(cant use private variable  declaredin other class
	}

}
