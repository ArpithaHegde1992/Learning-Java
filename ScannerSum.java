package assignments;

import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
	//  Assignment 55
		// add two numbers using scanner class
		
		Scanner s1 = new Scanner (System.in);
		int a= s1.nextInt();
		int b = s1.nextInt();
		
		int sum=a+b;
		System.out.println(sum);
		

	}

}