package demoPackage;

abstract class Banks {
	abstract int getinterest();}

	class Pnb extends Banks{
		int getinterest() {
			return 7;}}
	
	

	 class Sbi extends Banks{
	  int getinterest() {
		  return 8;
		  
	  }
	}
	 public  class Abstract  {
		 
				public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banks s=new Sbi();
		System.out.println(s.getinterest());
		//Sbi objs=new Sbi();
		//objs.getinterest();
	}

	 }
	 
