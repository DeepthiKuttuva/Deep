package Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Do while first executes the statements and then goes to the condition. If the contion is not satisfied then the block of statements will be executed atleast once
		int i=1;
		int j=0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);// here in while we should include semicolon
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<=10);

	}

}
