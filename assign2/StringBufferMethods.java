package assign2;

public class StringBufferMethods {
	
//Assignments 89,90
	
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Arpith");
System.out.println(s);
//append
 System.out.println(s.append(" Ramesh"));
 //insert
 System.out.println(s.insert(4, "hegde")); //4 th index is replace with ddt
 //replace
 System.out.println(s.replace(1, 4, "kk")); //1-3 index replace with aramram
 //delete
 System.out.println(s.delete(1, 3));//1-2 deleted
 //reverse
 System.out.println(s.reverse());
 //capacity
 System.out.println(s.capacity());
 
 
	}

}
