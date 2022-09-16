package SuperKeyword;
class Animal{
	String color="white";

void eat() {
	System.out.println("Animal eats food");
}
Animal(){//constructor animal is created
	System.out.println("Animal is created");
}
}
class Dog extends Animal{
	String color="black";//now color will be black as it is overridden. If we want the parent class color to be displayed then we should use super keyword.
  
void display() {
	System.out.println(color);
	//super is used to refer immediate parent class instance variable
	System.out.println("parent class color:"+super.color);
	
}
void eat() {
	//super is used to invoke immediate parent class method
	super.eat();//calling parent animal class method eat
	System.out.println("Dog eats bone");
}
Dog(){
	//if we want parent class constructor has to be then we use super
	super();//invoke parent class constructor
	System.out.println("Dog is created");
	
}
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display();
		d.eat();
		
		
		

	}

}
