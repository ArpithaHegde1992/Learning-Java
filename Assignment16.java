package com.test;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		// circumference rectangle
				Scanner s1=new Scanner(System.in);
				System.out.println("enter the value l");
				double l=s1.nextDouble();
				System.out.println("enter the value b");
				double b=s1.nextDouble();
				System.out.println("circumference of the rectangle is");
				double circumference = 2*(l+b);
				System.out.println(circumference);
					
	}

}
