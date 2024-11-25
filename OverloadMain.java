package assignments;


//assignment 48
//method overloading

public class OverloadMain{
	public static void main()
	 {
	 	System.out.println("1");
	 	}
public static void main (char a)
	 {
	 System.out.println("2");	
	 }
	public static void main(String[] args) {
	
		main();
		main('R');

	}
 
}
//we can overloda static or nonstatic using main//