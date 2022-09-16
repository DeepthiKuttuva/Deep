package subpackage;

public class Interface_sum1 implements Interface_sum {
public int sum(int a,int b) {
	int c=a+b;
	System.out.println(c);
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_sum1 obj=new Interface_sum1();
		obj.sum(8,9);

	}

}
