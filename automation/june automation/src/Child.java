


public class Child extends Parent_child{
	Child(){
	System.out.println("grand child is derived from child");	
	}
public void c1() {
	System.out.println("child class");
}
public void c2() {
	System.out.println("child class is derived from parent class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent_child cobj=new Parent_child();
		Child cj= new Child();
        //cobj.p1();
        cj.p1();
        cj.c1();
        cobj.p1();
        //cobj.c1();
	}

}
