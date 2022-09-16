package Array;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int [5];// single dimensional array specifying limits
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("array length:" +a.length );
		int b[]= {100,200,300,400,500}; // array without specifying the limits
		// to read the array we write a for loop
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);// here 'i' specifies the index of an array
		}
		
		//to read values using enhanced for loop. this enhance for loop is used for arraylist,hashmap
		System.out.println("to read values using enhanced for loop");
		for(int i:a) {
			System.out.println(i);
		}
	}

}
