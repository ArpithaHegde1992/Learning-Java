package assignments;

public class StringFunctions3 {
	//assignment 73,74,75,76

	public static void main(String[] args) {
		
	//contains

		String a="Arpitha hegde";
		System.out.println(a.contains("hegde")+ " 10");
		//or
	boolean b=	a.contains("Ashok");
	System.out.println(b+" 13");
	
	//matches
	//(.*) is multi character search 
	//check if the given string ends with "l"
	String c="School";//multicharacter search
	System.out.println(c.matches("(.*)l")+ " 19");
	
//check if l is at the starting	
	boolean c1=c.matches("l(.*)");
System.out.println(c1+ " 23");

//check if a is at the middle
boolean c2=c.matches("(.*)l(.*)");//not middle l is present in string or not
System.out.println(c2+ " 27");
 
boolean c3=c.matches("(.*)m(.*)");//m is present or not in the string
System.out.println(c3+" 30");
//or
System.out.println(c.contains("o")+ " 32");//we can use contains also

//check if string has 4 characters or not
// . is single character search

String d="arpitha";
System.out.println(d.matches("...."));// no.of dots equals no of char then true



	}

}
