package assignments;

import java.util.InputMismatchException;

public class ThrowsProblems {
	
	//assignment 42

	public static void main(String[] args) throws NullPointerException,InputMismatchException 
	{//throws along with method
	
	{
		if(1==3)
		{
	throw new  NullPointerException("ha");//throw inside method
		}
		else
		{
			throw new InputMismatchException("kj");
		}
	}

}
}