// This program has constructors,methods and constructor and method overloading
package demoPackage;


public class Pen {

	String color;
	int x = 10;
	int y;
	static String college = " SASTRA";
	static String place = " Chennai";

	Pen() {
		System.out.println("Hello");
	}
	Pen(String a,String b,String c){
		System.out.println("The colors of the pen are " +a +b +c);
	}

	Pen(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	Pen(String s, float c) {
		System.out.println(s + c);

		// System.out.println(c);
	}

	Pen(int c, double d) {
		if (c == 4) {
			System.out.println("inside if");
		}
	}

	Pen(String s, String m) {
		if (s == "Deep") {
			System.out.println("the value of s is "  +s);
		} else {
			System.out.println("the value of s is not deep");
		}

	}

	Pen(int rollno, String name) {
		System.out.println(rollno + name + college + place);
		// System.out.println(name);
	}

	Pen(float a){
		System.out.println("area of circle is "+(3.14*(a*a)));
	}
	Pen(double b){
		System.out.println("area of a square is " +(b*b));
	}
	Pen(int a){
		System.out.println("the area of triangle is "+(1.732*(a*a)));
	}
	public void m1() {
		System.out.println("this is sample method");
	}

	public int m2(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public void m2(int a, String b) {
		System.out.println("method overload " +a +b);
	}

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void mul(int g, int h) {
		System.out.println((g * h));
	}

	static void display() {
		System.out.println(college + place);

	}
	public void area(int a,int b) {
		System.out.println("the area of rectangle is "+(a*b));
	}
	 int green(int a) {
		System.out.println("the number of green pens is" +a);
		return a;
	}

	public static void main(String[] args) {

		Pen redPen = new Pen();
		Pen bluePen = new Pen();
		Pen greenPen=new Pen();
		redPen.color = "red ";
		bluePen.color = "blue ";
		greenPen.color="green";
		bluePen.y = 8;
		System.out.println(redPen.color + redPen.x);
		System.out.println(bluePen.color + bluePen.y);
		System.out.println(greenPen.color);
		Pen pen1 = new Pen();
		Pen pen2 = new Pen(3, 7);
		Pen pen3 = new Pen("deep", 5.6f);
		Pen pen4 = new Pen(4, 6.0);
		Pen pen5 = new Pen(11, " Deep");
		Pen pen6 = new Pen(22, " deepthi");
		Pen pen7 = new Pen("Deep", "aaaa");
		Pen pen8=new Pen(4f);
		Pen pen9=new Pen(5.6d);
		greenPen.green(5);
		redPen.m1();
		redPen.m2(6, 8);
		bluePen.m2( 1, " Deep");
		bluePen.sum(5, 7);
		bluePen.mul(3, 7);
		Pen.display();
		redPen.area(9,7);
		Pen pen0=new Pen("red  ","blue  ","green  ");
		Pen pen10=new Pen(5);
	}

}
