package Overriding;
class Banks{
	double rateOfInterest() {
		double interest=0;
		System.out.println("rate of interest "+interest);
		return interest;
		
	}
}
class SBI extends Banks{
	double rateOfInterest() {
		double interest=10.5;
		System.out.println("SBI rate of interest "+interest);
		return interest;
		
	}
	
}
class ICICI extends Banks{
	double rateOfInterest() {
		double interest=9.7;
		System.out.println("ICICI rate of interest "+interest);
		return interest;
		
	}
}
class Axis extends Banks{
	double rateOfInterest() {
		double interest=9.2;
		System.out.println("Axis rate of interest "+interest);
		return interest;
		
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s =new SBI();
		s.rateOfInterest();
		ICICI i =new ICICI();
		i.rateOfInterest();
		Axis a=new Axis();
		a.rateOfInterest();
		

	}

}
