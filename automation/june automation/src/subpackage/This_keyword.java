package subpackage;

public class This_keyword {
	int id;
	String name;
	float fee;
	This_keyword(int id,String name,float fee){
		this.id=id;
		this.name=name;
		this.fee=fee;
		
	}
	void display() {
		System.out.println(id +name +fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_keyword obj=new This_keyword(100," Deep ",700f);
		This_keyword obj1=new This_keyword(101," Sush ",800f);
		obj.display();
		obj1.display();
		

	}

}
