package Methods;

public class MethodsDifferentTypes {
	int a=10;
	int b=20;
	//cse1:No parameters,no return types
    void sum() {
    	int c=a+b;
    	System.out.println(c);
    }
    //case 2: No parameters but return type present
    int add() {
    	int c=a+b;
    	System.out.println(c);
    	return(c);
    }
    //case 3: Parameters present but no return type
    void summation(int x,int y) {
    	System.out.println(x+y);
    }
    //case4:parameters and return type present
    int addition(int x,int y,int z) {
    	System.out.println(x+y+z);
    	return(x+y+z);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDifferentTypes m=new MethodsDifferentTypes();
		m.sum();
		m.add();
		m.summation(30, 80);
		m.addition(20, 40, 60);
		
		
		

	}

}
