package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 2;
		int k =10;
		int l= 11;
		if(l>i && l>j && l>k) {
			System.out.println("l is greatest");
		}
		while (i <= 10) {
			System.out.println(i);
			i++;// if this statement is not given ,the loop will be infinite printing the given
				// number
		}
		System.out.println("Printing even numbers till 10");
		while (j <= 10) {
			System.out.println(j);
			j += 2;// printing only the even numbers
		}
		System.out.println("Decrementing numbers from 10 to 1");
		while(k>0) {
			System.out.println(k);
			k=k-1;
		}
		System.out.println("Decrementing odd numbers from 10 to 1");
		while(l>0) {
			System.out.println(l);
			l-=2;
		}
		
	}

}
