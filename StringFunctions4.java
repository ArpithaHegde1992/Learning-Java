package assignments;

public class StringFunctions4 {

	public static void main(String[] args) {
		
		// assignment 32
	
//charAtIndex
//check which character is present at perticular index
		String a="Ramesh";
		System.out.println(a.charAt(2));
		//or
	char b=a.charAt(5);
	System.out.println(b);	
	
	//indexOfChar
	
	int b1=a.indexOf('s');
	System.out.println(b1);
	
	//reverse string
	/*
	 * int i=a.length();
	 * 
	 * String rev=""; for(int j=i-1; j>-1 ; j--) { rev=rev+a.charAt(j); }
	 * System.out.println("Reverse of "+a+" is "+rev);
	 */
	String c="School";
	String rev="";
	for(int i=c.length()-1; i>-1;i-- )
	{
	/*rev=rev+c.charAt(i)	;}
	System.out.println("reverse of school is--"+rev);
	    or
	*/
	
	char c1=c.charAt(i);
	rev=rev+c1;
	}	
System.out.println("reverse of "+ c + " is "+ rev);
	
	}
}
