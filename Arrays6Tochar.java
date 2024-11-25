package assignments;

import java.util.Arrays;

public class Arrays6Tochar {

	public static void main(String[] args) {
		//assignment 34
		
		//to char array--converts given string into array
		//sorting
		
		String name="arpitha";
		char c[]=name.toCharArray();
		System.out.println(c[3]);
		System.out.println(Arrays.toString(c));
		//sorting
		Arrays.sort(c);//first to sort then in print give to string not sort
		System.out.println(Arrays.toString(c));

//anagram
		
		//find out given two string ares anagrams of each other
		
		String a="arm";
		String b="ram";
		
		char a1[] =a.toCharArray();//convert to to char array
		char[] b1=b.toCharArray();
			Arrays.sort(a1);	//sorting
			Arrays.sort(b1);
		//	System.out.println(Arrays.toString(a1));//convert to string
		//	System.out.println(Arrays.toString(b1));
				// or
			
			
		boolean c1=	Arrays.equals(a1, b1);
	if(c1==true)
	{
		
System.out.println("the two strings "+ a + " and "+ b + " are anagrams");
	}
	else
	{
System.out.println("the two strings "+ a + " and "+ b + " are not anagrams");
}}}
