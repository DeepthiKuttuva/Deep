package demoPackage;

public class Inter_class implements Inter {
public void house() {
	System.out.println("sample interface where interface is in other file");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter obj1=new Inter_class();
		Inter_class obj=new Inter_class();
		obj.house();
obj1.house();
	}

}
