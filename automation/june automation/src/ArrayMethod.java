
public class ArrayMethod {
	public void m1(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	static void m2(int c[]) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	static void m3(int e[]) {
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 56 };
		// int p[]=new int [5];//another way of declaring array

		ArrayMethod obj = new ArrayMethod();
		System.out.println("first method using array");
		obj.m1(a);
		int d[] = { 2, 5, 7, 8, 9 };
		System.out.println("1st static method using array");
		m2(d);
		System.out.println("2nd static method using array");
		int f[] = { 9, 8, 7, 65 };
		m3(f);
	}

}
