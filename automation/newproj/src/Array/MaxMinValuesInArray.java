package Array;

public class MaxMinValuesInArray {
	public int max(int a[]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
		
	}
	public int min(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		MaxMinValuesInArray m= new MaxMinValuesInArray();
		System.out.println("Mximum value"+ m.max(a));
		System.out.println("Minimum value" +m.min(a));

	}

}
