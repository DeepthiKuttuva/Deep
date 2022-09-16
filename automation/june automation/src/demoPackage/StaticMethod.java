package demoPackage;


//Method when declared static uses class name and object is not created for uch methods.
public class StaticMethod {
	static String college = "IIT";
	final String place = "chennai";
	int rollno;
	String name;

	public void m1(int r, String n) {
		rollno = r;
		name = n;

		System.out.println(rollno + name);
	}

	static void change() {
		college = "BBM";

		System.out.println(college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod obj = new StaticMethod();
		obj.m1(11111, " Deepthi");
		StaticMethod.change();

	}

}
