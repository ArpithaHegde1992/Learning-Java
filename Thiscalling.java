package assignments;

//assignment 61
//thiscalling

public class Thiscalling {
	// we should call this() explicitly for both para and non para
	Thiscalling()
	{
	this(6)	;
	System.out.println("a");	
	}
	
	Thiscalling(int a)
	{
	this(7.9);
	System.out.println("b");
	}
      
	Thiscalling(double a)
	{
		this(3,7);
	System.out.println("c");	
	}
	
	Thiscalling(int a,int b)
	{
		System.out.println("d");
	}
		public static void main(String[] args) {
			Thiscalling x =new Thiscalling();// or new Thiscalling
					
			//4 constructors are there but we have to create only one object
		}

}
