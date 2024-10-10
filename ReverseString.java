package com.test;

public class ReverseString {

	public static void main(String[] args) {
		
		String a="Arpitha";  
		String rev="";
		for(int i=(a.length()-1);i>-1;i--)
		{
			rev=rev+a.charAt(i);
		}
System.out.println(rev);
	}

}
