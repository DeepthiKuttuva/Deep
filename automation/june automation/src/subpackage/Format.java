package subpackage;
import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
    	/*String ss1=null,ss2=null,ss3=null;
    	int i1=0,i2=0,i3=0;*/
    	
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
          //  for(int i=0;i<3;i++){
            	
                String s1=sc.next();
                int x=sc.nextInt();
                String s2=sc.next();
                int y=sc.nextInt();
               String s3=sc.next();
               int z=sc.nextInt();
                
                
                
               
              /* if (i==0) {
                	ss1=s1;i1=x;
                
                }
                else if(i==1)
                {
                	ss2=s1;i2=x;
                }else  {
                	ss3=s1;i3=x;
                }*/
                //Complete this line
             System.out.println("================================");
                System.out.format("%-15s%03d%n",s1,x);
                System.out.format("%-15s%03d%n",s2,y);
                System.out.format("%-15s%03d%n",s3,z);
               System.out.println("================================");
           // }
            
            //System.out.println("================================");
            //sc.close();
    }
}
