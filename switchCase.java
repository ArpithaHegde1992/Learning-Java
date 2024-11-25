package assignments;

import java.util.Scanner;

public class switchCase {
	
	//Assignment 56

	public static void main(String[] args) 
	{
//we should add break at the end otherwise all functions get execute
		
		/* Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a= s.nextInt();
	switch (a )*/ //we can use scanner class also
		switch(3)
	{
	  
	case 1:
		
		System.out.println("Sunday");
		break;	
	case 2:
		System.out.println("Monday");
		break;
	case 3 :
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wednesday");
		break;
	case 5 :
		System.out.println("Thursday");
		break;	
	case 6 :
		System.out.println("Friday");
		break;
	case 7 :
		System.out.println("Saturday");
		break;
		
	default :
		System.out.println("enter valid number");
	
	}
	}


	}

