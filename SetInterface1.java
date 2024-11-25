package assignments;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetInterface1
{
	public static void main(String[] args) 
	
	//Assignment 47
	//iterate set interface
	{
		Set s1=new HashSet();
		s1.add(66);
		s1.add(43);
		s1.add(63);
		s1.add(85);
		s1.add(2);
		s1.add(7);
		s1.add(2);
		s1.add(7);
		s1.add(2);
		s1.add(7);
		s1.add(null);
		s1.add(null);
		s1.add("manish");
		s1.add("abhsihek");
		System.out.println(s1);
		
		
		Iterator i1=		s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		
		
		
	}

}
