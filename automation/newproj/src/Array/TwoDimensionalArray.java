package Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [3][2];
		int b[][]= {{100,200},{300,400},{500,600},{700,800}};
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		System.out.println("row count" +a.length);
		System.out.println("column count "+a[1].length);
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("printing the value of array b");
		System.out.println(b[0][1]);
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}
		System.out.println("Enhanced For loop for multidimensional array");
		for(int r[]:a) {
			//here every row is read not single value, so the values 10,20 will be read 1st then, 30,40 will read and then it goes to next row
			for(int i:r)//only single dimensional array can hold multiple values{
				System.out.println(i);
		}

	}

}
