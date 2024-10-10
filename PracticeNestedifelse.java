package com.test;

public class PracticeNestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;
		int c = 9;

		if (a < b)// true
		{
			System.out.println("a<b");
			if (b < c)// true
			{
				System.out.println("b<c");
			}

			else {
				System.out.println("b >= c");
			}
			if (c > a)// true
			{
				System.out.println("c>a");
			}

			else {
				System.out.println("c<=a");//true
			}
		}

		else

		{
			System.out.println("5");
		}

	}
}// multiple true conditions then multiple executes
