package demoPackage;
interface Fam{
	void members();
	String head(String a);
}
interface Deepthi extends Fam{
	void gender();
	String kids(String a,String b);
}
public class Interfaces implements Deepthi{
	public void members() {
		System.out.println("there are 4 members");
	}
	public void gender() {
		System.out.println("female");
	}
public String head(String a) {
	System.out.println("the head of family is "+a);
	return a;
}
public String kids(String a,String b) {
	System.out.println(a +" and" +b+"are kids");
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces obj=new Interfaces();
		obj.members();
		obj.gender();
        obj.head("Venkatesh");
        obj.kids("Prachu ", " Advaith ");
	}

}
