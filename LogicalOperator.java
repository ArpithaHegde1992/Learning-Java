package com.test;
public class LogicalOperator 
{
public static void main(String[] args) 
{
int a=10;
int b=20;
if(!(a<6 && b==a))  //c1=F c2=F
{
	System.out.println("Hello");
}
if(!(a<6 || b==20))  //c1=F c2=T
{
	System.out.println("Hello 1");
}
	
	
	
	
	
}
}
