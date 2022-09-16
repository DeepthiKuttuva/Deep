import java.util.Scanner;
public class Switch_avgscore {

	public static void main(String[] args) {
		int avg;
		System.out.println("print the average  score:");
		Scanner s=new Scanner(System.in);
		avg=s.nextInt();
		switch(avg)
		{
		case 1:
			if(avg>=90)
			{
    		System.out.println("grade is A");
			}
		break;
		case 2:
			if(avg>=70 && avg<90)
			{
			System.out.println("grade is  B");
			}
			break;
		case  3:
			if(avg>=50 && avg<70)
			{
			System.out.println("grade is C");
			}
			break;
		case 4:
			if(avg<50)
			{
				System.out.println("grade is F");
			}
			break;
		}


	}

}
