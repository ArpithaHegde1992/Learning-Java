package assign2;

//assignments 87,88
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map <String,Integer>m1= new HashMap<String,Integer>();//upcasting and add rapper class
         m1.put("arp", 75);
         m1.put("ram", 69);
         m1.put("ruv", 90);
         
         System.out.println(m1);
         
         for(String s:m1.keySet())// to fetch only keys
        	 
         {
	System.out.println(s);
}
         
         for(Integer a:m1.values())// to fetch oly values
         {
        	 System.out.println(a);
        		 
         }
         
         
  //important 
       //  one way to fetch is
  for(Entry<String,Integer> c :m1.entrySet())// to fetch both key and values
  {
	 System.out.println(c); 
  }
 
 //another way is        
Map <String,Integer>m= new HashMap<String,Integer>();         
  m.put("arpita", 73);
  m.put("ramesh", 65);
  m.put("dhruv", 98);
  System.out.println(m);     
       
  Set<Entry<String,Integer>> p =m.entrySet();
  Iterator<Entry<String,Integer>> i=p.iterator();
  
  while(i.hasNext())
  {
	System.out.println(i.next());  
  }
  
  
  
  
  
  
  
  
  
  
         
         
         
}}