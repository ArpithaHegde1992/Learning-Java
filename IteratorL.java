package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorL {

	public static void main(String[] args) {
		
		//assignment 46
		
		// Iterate list interface
		
		List a=new ArrayList();
		a.add(789);
		a.add(true);
		a.add("arp");
		a.add(null);
		a.add(9.9);
		a.add(789);
		a.add(true);
		a.add("arp");
		a.add(null);
		a.add(9.9);
	//itrator do only in forwad direction	
		Iterator m=a.iterator();
		while(m.hasNext())
		{
			System.out.println(m.next());
		}
	}

}
