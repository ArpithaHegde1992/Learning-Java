package assignments;

import java.util.Arrays;

public class Arrays2 {
	
// assignment 25,26
	
	public static void main(String[] args) {
		// check if 2 arrays are equal?
		
		//int
		
		int No[]=new int[3];
		No[0]=2;
		No[1]=4;
		No[2]=6;
		
		int No2[]=new int[3];
		No2[0]=2;
		No2[1]=4;
		No2[2]=6;
		
boolean b=	Arrays.equals(No, No2);
		
System.out.println(b);
//string

String name[]=new String[3];
name[0]="arpita";
name[1]="ramesh";
name[2]="dhruv";

String name2[]=new String[3];
name2[0]="arpita";
name2[1]="ramesh";
name2[2]="dhruv";

boolean c=Arrays.equals(name, name2);
System.out.println(c);

//char
char let[]=new char[3];
let[0]='a';
let[1]='r';
let[2]='d';

char let2[]=new char[3];
let2[0]='a';
let2[1]='m';
let2[2]='d';
System.out.println(Arrays.equals(let, let2));
	}

}
