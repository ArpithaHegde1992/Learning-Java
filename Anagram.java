package assignments;

import java.util.Arrays;

public class  Anagram {

	public static void main(String[] args) {
		
		// assignment 34
		
  String a="ram";
  String b="amr";
  char[] c=a.toCharArray();
  char c1[]=b.toCharArray();
  Arrays.sort(c);
  Arrays.sort(c1);
 boolean m=Arrays.equals(c, c1) ;
  if(m==true)
  {
	  System.out.println("anagram"); 
  }
  else
  {
	  System.out.println("not anagram");
  }
	}

}

