package com.test;

public class Bus_fare_logical_operator 
{
public static void main(String[] args) 
{
	char Gender1 = 'M'; //Bus fare program using logical operators
	int age = 61 ;
		
	if (age<=5 && Gender1 == 'M') 
	{
	
		System.out.println("Free travel");

	}
	
	if (age>5 && age<=9 && Gender1 == 'M') 
	{
		System.out.println("one-forth ticket");

	}
	
    if (age>9 && age<=12 && Gender1 == 'M') 
    {
    	System.out.println("Half-ticket");
    }
	
    if (age>12 && age<60 && Gender1 == 'M') 
    {
    	System.out.println(" Full-ticket");
    }
    
    if (age>= 60 && Gender1 == 'M') 
    {
    	System.out.println(" Half-ticket");
    }
    if (Gender1 == 'F') 
    {
    	System.out.println("Free");
    }   
}
}
