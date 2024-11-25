package assignments;

import java.util.Arrays;

public class ArraysReverse {
	
	//assignment 27

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//copi 1 array into another in reverse order
		
		int roll_no []=new int[4];
		roll_no[0]=2;
		roll_no[1]=4;
		roll_no[2]=6;
		roll_no[3]=8;
		 int roll_no2[]=new int[4];
		 
		 for(int i=0,k=3;i<roll_no.length;i++,k--)
		 {
			 roll_no2[k]=roll_no[i];
		 }
		 System.out.println(Arrays.toString(roll_no));
		 System.out.println(Arrays.toString(roll_no2));
	}

}
