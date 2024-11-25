package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



public class ListOfIterator {
	
//assignment 80
	//iterate using listIterator

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a=new ArrayList();
		a.add(789);
		a.add(true);
		a.add("arp");
		a.add(null);
		a.add(9.9);
		
	ListIterator m=	a.listIterator();
//listiterate used to iterate in both forward and backward direction	
	while(m.hasNext())
	{
		System.out.println(m.next());
	}
	System.out.println("for reversing");	
	
	
	ListIterator m1=	a.listIterator();
//listiterator for backward direction	
	//for reversing we use both forward and backward ,only backward is not possible
	
	while(m1.hasNext())
	{
		System.out.println(m1.next());
}
	while(m1.hasPrevious())
	{
		System.out.println(m1.previous());
}
}}