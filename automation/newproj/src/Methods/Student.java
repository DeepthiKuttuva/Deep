package Methods;

public class Student {
	int Sid;
	String Sname;
	int Sub1,Sub2,Sub3;
	void getStuData(int id,String name) {
		Sid=id;
		Sname=name;
		
	}
	void getStuMarks(int Subject1,int Subject2,int Subject3) {
		Sub1=Subject1;
	    Sub2=Subject2;	
	    Sub3=Subject3;
		
	}
	int TotalMarks() {
		System.out.println("Total marks: "+ (Sub1+Sub2+Sub3));
		return (Sub1+Sub2+Sub3);
	}
	void display() {
		System.out.println(Sid + Sname);
		System.out.println("Subjects: "+Sub1+" " +Sub2+" " +Sub3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.getStuData(1, " deep ");
		s.getStuMarks(100, 90,95);
		s.display();
		s.TotalMarks();

	}

}
