package JumpStatements;

public class ContinueStatemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			
			if(i==6) {
				continue;// this statement will just skip that number mentioned in if loop and print the rest of the numbers
			}
			System.out.println(i);
			
		}
		System.out.println("skipping 2 numbers");
		for(int j=10;j>0;j--) {
			if(j==2||j==3) {
				continue;
			}
			System.out.println(j);
		}
		

	}

}
