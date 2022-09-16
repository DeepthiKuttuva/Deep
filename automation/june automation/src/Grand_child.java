
public class Grand_child extends Child{
	
	public void g1()
	{
		System.out.println("This is grand child class");
	}
	 Grand_child() {
		System.out.println("this grand child extends child class ");
	}
     Grand_child(int a) {
    	System.out.println("the no. of persons in family are "+a);
    }
    public void c2() {
    	System.out.println("The content is overridden");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grand_child obj=new Grand_child();
		obj.p1();
		obj.c1();
		obj.g1();
		
		Grand_child obj1=new Grand_child(4);
		obj.c2();
		//Parent_child obj2=new Parent_child();
		//Child obj4=new Child();

	}

}
