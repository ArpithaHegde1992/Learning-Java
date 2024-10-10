package com.test;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
		
		System.out.println("enter l1");
	  double l1=s1.nextDouble();
	  System.out.println("enter l2");	  
	  double l2=s1.nextDouble();
	  System.out.println("Enter the value of h");
	  double h=s1.nextDouble();
	  System.out.println("Area of the trapezium is");
	  double area= 0.5*(l1+l2)*h;
	  System.out.println(area);
	}

}
