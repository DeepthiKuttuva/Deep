package demoPackage;
 interface Family {
void flow();
}
 interface Family1 extends Family{
	 void show();
 }
 class Interface1 implements Family1{
	public  void flow() {
		 System.out.println("This family starts from grandparents");
	 }
	public void show() {
		 System.out.println("this family starts from parents");
	 }
	public static void main(String[]args) {
		Interface1 obj=new Interface1();
		obj.flow();
		obj.show();
	}
 }
