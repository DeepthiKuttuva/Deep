abstract class Shape{
	abstract void draw();
	
}
class Circle extends Shape{
	void draw(){
		System.out.println("draw a circle");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("draw a rectangle");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj=new Circle();
		obj.draw();
		Shape obj1=new Rectangle();
		obj1.draw();

	}

}
