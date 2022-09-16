package conditionalStatements;

public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String trafficSignal ="Black";
		if(trafficSignal=="Green") {
			System.out.println( "The vehicle has to go");
		}
			else if(trafficSignal=="Yellow")	{
				System.out.println("The vehicle has to watch out");
				
			}
			else if(trafficSignal=="Red") {
				System.out.println("The vehicle has to stop");
			}
		
			else{
				System.out.println("Signal is not working");
			}
		}
		
			
		}

	


