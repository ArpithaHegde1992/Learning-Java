package assignments;

public class Stringfunctions2 {

	public static void main(String[] args ) {
		
		//Assignment 31
		
		//concat(add two strings)
		
		String a="Arpitha";
		System.out.println(a.concat(" Hegde"));
		System.out.println(a.concat(" Arpitha").concat(" Ashok").concat (" Hegde"));
		
		//replace
		
System.out.println(a.replace('a', 'm'));//replace char char

String b ="Arpitha Hegde";
System.out.println(b.replaceAll("Hegde", "Ramesh"));

  //assignment 31( remove all space using replaceall method)
  
  
  String a1="My name is java ";
  String b1=a1.replaceAll(" ", "");//remove all spaces
  System.out.println(b1);
	}

}
