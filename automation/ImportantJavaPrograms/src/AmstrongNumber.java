
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,a,temp;
		int n=453;
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=(a*a*a)+a;
		}
		if(temp==c) {
			System.out.println("Amstrong number");}
		
			else {
				System.out.println("not Amstrong");
			
		}
		

	}

}
