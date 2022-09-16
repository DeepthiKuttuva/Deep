package Inheritance;
class Parent{
	String s;
	void print() {
		System.out.println(s);
	}
}
class Child1 extends Parent{
	String t;
	void display() {
		System.out.println(t);
	}
}
class Child2 extends Child1{
	
	void show(String m) {
		System.out.println(m);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//here if we create object fpr Class Child2 , then we can access both the parent class and child1,
		Child2 obj= new Child2();
		obj.s="Welcome";
		obj.t="To Java";
		obj.print();
		obj.display();
		obj.show("Deepthi");
	}

}
