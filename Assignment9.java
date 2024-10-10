package com.test;

public class Assignment9 {

	static void add (int a,int b) 
	{
	  int sum = a+b;
	 System.out.println(sum);
	}
	static void substraction (int c,int d)
	{
	 int sub = c-d;
	 System.out.println(sub);
	 }
    static void login (String un,String password) 
    { 
    	System.out.println("login to amazon");
    }
	void addition (int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	void mult (double a,double b)
	{
		double multi =a*b;
		System.out.println(multi);
	} 
	void login(String un,String password,String date)
	{
		System.out.println("login to facebook");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 add(2,3);
 substraction(15,6);
 login("arp","k866");
 Assignment9 n1=new Assignment9();
		 n1.addition(3,5);
		 n1.mult(2,3);
		 n1.login("gfyu", "hy78", "aug7");
		 


	}

}
