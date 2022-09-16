interface Printable{
	void print();
}
public class A6 implements Printable {
 public void print() {
	 System.out.println("hello");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Printable obj=new A6();
    obj.print();
    A6 obj1=new A6();
    obj1.print();
	}

}
