package demoPackage;

 interface Vehicle {
 void run();
}
 public class Car implements Vehicle{
	 public void run() {
		 System.out.println("runs on a road");
	 }
	 public static void main(String[]args) {
		 Car obj=new Car();
		 obj.run();
	 }
 }
