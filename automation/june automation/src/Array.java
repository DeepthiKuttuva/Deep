
public class Array {

	public static void main(String[] args) {
		int a[] = new int [5];
		a[0]=0;
		a[1]=1;
		//a[2]=2;when a[2] is commented, 0 will be printed
		a[3]=3;
		a[4]=4;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			//System.out.println(a.length);
		}System.out.println(a.length);
		//System.out.println(a[6]);it will throw exceptiom as a[6] is not declared
		// TODO Auto-generated method stub

	}

}
