package com.test;

import java.util.InputMismatchException;

public class Vaiva2 {

	public static void main(String[] args) throws NullPointerException,InputMismatchException
	{
		// TODO Auto-generated method stub
if(1==2)
{
	throw new NullPointerException("ab");
}
else
{
	throw new InputMismatchException ("cd");
}
	}

}
