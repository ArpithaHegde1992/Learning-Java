package assignments;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		// assignment 41

		try
		{
		int a= 1/0;//line giving exception in try block
		System.out.println(a);
		}
		catch(ArithmeticException m)//exception name in catch block
		{
			
		System.out.println("sorry but there was a blocker but we handled it");
		}
	}
//if exception present catch execute,exception not present try execute
}
