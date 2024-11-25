package assignments;


import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
	
	//assignment 43

	public static void main(String[] args) {
		// accept the values of 2 arrays at the run time,int type
		 
		Scanner s1=new Scanner(System.in);
		int  roll[]=new int[3];
	//we can use for loop or tostring
		for(int i=0;i<3;i++) {
			roll[i]=s1.nextInt();
			
		}
		
		System.out.println(Arrays.toString(roll));
	//to string convert to horizontal	
		

	}

}
