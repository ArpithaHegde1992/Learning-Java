package assignments;

public class StringCount {

	public static void main(String[] args) {
		
		//assignment 36
		
		// how many are alpha,numeric,spsce,special char
		
		String a="My name is arpitha 1992 ";
		int count_of_alphabet=0;
		int count_of_numeric=0;
		int count_of_space=0;
		char b[]=a.toCharArray();
		
for(int i=0; i<a.length();i++)
{
boolean c=	Character.isLetter(b[i]);
if(c==true)
{
count_of_alphabet++	;
}
}
System.out.println("the number of alphabets are "+count_of_alphabet);

// numeric

for(int j=0;j<a.length();j++)
{
	boolean b1=Character.isDigit(b[j]);
	if(b1==true)
	{
		count_of_numeric++;
	}
	
}
System.out.println("number of numeric are "+ count_of_numeric);

//space
for(int k=0;k<a.length();k++)
{
	boolean b3=Character.isWhitespace(b[k]);
	if(b3==true)
			{
		count_of_space++;
			}
}
System.out.println("number of spaces are "+ count_of_space);

	}

}
//number of special char=length-(letter)-(numeric)-(space)
