package assignments;
class Animal{
	
	//assignment 60
	//supercalling statement
//non para constructor may impli or explicitly
Animal()
{
System.out.println("3");
}

}
class Bird extends Animal
{

	Bird()
	{
	
	System.out.println("2");	
	}
}
public class SuperCalling extends Bird
{

	SuperCalling()
	{
		super();
		System.out.println("1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new SuperCalling();
  
	}

}
