import java.util.Scanner;
import java.text.NumberFormat;
public class Average_score {

	public static void main(String[] args) {
		
		float avg;
		System.out.println("Enter the average score: " );
		
		
		Scanner s=new Scanner(System.in);
        
        avg=s.nextFloat();
         avg= (float)avg*100/100;
        NumberFormat defaultFormat=NumberFormat.getPercentInstance();
        defaultFormat.setMinimumFractionDigits(1);
        
        System.out.println("Percent format: " +defaultFormat.format(avg));
        
        
       // double formattedOutput = Double.parseDouble(defaultFormat.format(avg));
        if (avg >= 90)
         {
        System.out.println("The grade is A");
        }
        else if(avg >=70 && avg <90)
        {
        	System.out.println("The grade is B");
        }
        else if(avg>=50 && avg<70)
        {
        	System.out.println("The grade is C");
        }
        else if(avg<50)
        {
        	System.out.println("The grade is F");
        }
		}

	}


