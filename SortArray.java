package assignments;

import java.util.Arrays;

public class SortArray {
	

	public static void main(String[] args) {
		
		// Assignment 45
		
		//sort the string

		String name="arpitha";
		char c[]=name.toCharArray();
		
		//System.out.println(Arrays.toString(c));
		//sorting
		Arrays.sort(c);//first to sort then in print give to string not sort
		System.out.println(Arrays.toString(c));
		
		//sort the array
		int roll_no []=new int[3];
		roll_no[0]=10;
		roll_no[1]=1;
		roll_no[2]=20;
		
Arrays.sort(roll_no);
System.out.println(Arrays.toString(roll_no)); 


	}

}
