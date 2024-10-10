package com.test;

public class MultiInheritance1 extends MultiInheritance2
{
static void login()
{
	System.out.println("Login to Amazon");
}
	public static void main(String[] args) {
//all the method name of parent class should be called in mainmethods of child class//
login();
cart();
payment();
finish();
	}

}
