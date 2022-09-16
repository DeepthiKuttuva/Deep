package Loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In	 for loop, initilization,condion,increment/decrement will be on same line. Where as in while loop, 3 different steps for initialization,condition and increment
		//For is preferred when the limit is known where as while is preferred when limit is not known and we use "is Next() method
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			System.out.println("----Printing even numbers from 10 to 2");
			for(int j=10;j>0;j-=2) {
				System.out.println(j);
			}
		}
				

	}

}
