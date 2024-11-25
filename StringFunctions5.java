package assignments;

public class StringFunctions5 {
	
	//assignment 33


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//palindrome (like mirror)	
		//for checking first reverse the string then use equals
		String a="malayalam";
		String r="";
		for(int i=a.length()-1;i>-1;i--) {
	
	r=r+a.charAt(i);
	}
		System.out.println("reverse of "+ a +" is--" +r);
		
	if( a.equals(r)==true)
	{
		System.out.println(a + " is palindrome");
	}
	else
	{
		System.out.println(a + " is not a palindrome");
	}
}}
