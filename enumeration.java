package assignments;

import java.util.Enumeration;
import java.util.Stack;
//assignment 81
//enumeration
public class enumeration {
//enumeration is the type of iteration use only for lagacy classes.here stack is legacy class
	public static void main(String[] args) {
		Stack a=new Stack();
		a.add(12);
		a.add(67);
		a.add("ram");
		a.add(null);
		System.out.println(a);
		
		Enumeration b=a.elements();
		
		while(b.hasMoreElements())
		{
System.out.println(b.nextElement());
	}

}}
