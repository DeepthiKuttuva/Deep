package Inheritance;
class base{
	int a;
	void print() {
		System.out.println(a);
	}
}
class child extends base{
	int b;
	void show() {
		System.out.println(b);
	}
}
class newChild extends base{
	int c;
	void display() {
		System.out.println(c);
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch=new child();
		ch.a=12;
		ch.b=3;
		ch.print();
		ch.show();
		newChild n =new newChild();
		n.a=5;
		n.c=9;
		n.print();
		n.display();

	}

}
