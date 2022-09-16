package Constructor;

public class Calculation {
	int a,b,c;
	//Parmeterised constructor with the class names and having integer values
	Calculation(int val1, int val2, int val3){
		a=val1;b=val2;c=val3;
	}
	int sum() {
		System.out.println(a+b+c);
		return(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c= new Calculation(10,20,30);
		c.sum();
		

	}

}
