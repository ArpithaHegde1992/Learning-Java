package assignments;

public class StringReplace3 {

	public static void main(String[] args) {
		// Assignment 70,71,72
		//in the given string remove all the alphabets used,remove numeric,remove capital letters
		
		String a1="My name is java 456";
		  String b1=a1.replaceAll(" ", "");//remove all spaces
		  System.out.println(b1);
		 String b2=a1.replaceAll("[a-z]", "");
		 System.out.println(b2);
		 System.out.println(a1.replaceAll("[A-Z]", ""));
		 System.out.println(a1.replaceAll("[0-9]", ""));
			} 
	}


