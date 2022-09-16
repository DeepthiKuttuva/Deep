

public class Dog extends Animal{
 void m1(){
	System.out.println("the sound is woof");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Dog();
		obj.m1();
		Dog obj1=new Dog();
		obj1.m1();

	}

}
