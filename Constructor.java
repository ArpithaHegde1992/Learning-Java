package assignments;

public class Constructor {
	
	//assignment 49
// constructor overloading 
	
	Constructor(int a)
	{ System.out.println("welcome");
	}
	
	Constructor(int a,int b)
	{
	int sum=a+b;
	System.out.println(sum);	
	}
	
	Constructor(String username )
	{
		System.out.println("Arpitha");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Constructor(1);
new Constructor(2,3);
new Constructor( "dhftr" );
	}

}
