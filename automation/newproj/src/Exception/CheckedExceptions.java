package Exception;
//checked exceptions are handled during compile time. These exceptions can be handled with try-catch block or using throws keyword. throws is used at method level not at statement level
public class CheckedExceptions {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program is starting");
		System.out.println("program pauses");
		//handling checked exceptions using try-catch block
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
			System.out.println("InterruptedException handled");
		}
		
        System.out.println("program ends");
	}

}
