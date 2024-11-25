package assignments;

//assignment 57
//single level inheritance,both classes in same program

class Inheritance2
{
	
	void cart() 
	{
		System.out.println("ready");
	}
	
}

public class Inheritance1 extends Inheritance2
{
	void login()
	{
		System.out.println("welcome"); 
		
	}

	public static void main(String[] args) {
		
		Inheritance1 a=new Inheritance1();
		a.cart();
		a.login();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
