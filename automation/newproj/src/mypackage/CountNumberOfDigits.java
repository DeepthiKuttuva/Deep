package mypackage;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,num=000123456;
		while(num!=0) {
			num=num/10;
			count++;
			
		}
        System.out.println("the count:"+count);
	}

}
