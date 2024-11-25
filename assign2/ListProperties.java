package assign2;
import java.util.ArrayList;
import java.util.List;

public class ListProperties{
//Assignment 83
	public static void main(String[] args) {
	//we have to access the properties of list interface.so we use upcasting from arraylist	

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
		System.out.println(a);//accept indexing,dupicating,null,heterogenious
		
	}

}

