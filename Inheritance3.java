package assignments;

public class Inheritance3 extends Inheritance2 {
	//assignment 58
	
	//single level inheritance where  both the classes are in different program
	void find()
	{
		System.out.println("search");
	}

	public static void main(String[] args) {
		
   Inheritance3 b=new Inheritance3();
   b.cart();
   b.find();
	}

}
