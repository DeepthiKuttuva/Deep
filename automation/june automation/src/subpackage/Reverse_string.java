package subpackage;
import java.util.Scanner;
public class Reverse_string {

	public static void main(String[] args) {
		int n;
		//System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
String s= String.valueOf(n);
String reverse ="";
for(int i=s.length()-1;i>=0;i--) {
	reverse=reverse+s.charAt(i);
}
System.out.println(Integer.valueOf(s));
//System.out.println(Integer.valueOf(reverse));
System.out.println(reverse);
	}
	

}
