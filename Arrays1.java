package assignments;

import java.util.Arrays;

public class Arrays1 {
	
// assignment 24
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll_no []=new int[3];
		roll_no[0]=10;
		roll_no[1]=1;
		roll_no[2]=20;
		

		
		String name[]=new String[3];
		name[0]="arpitha";
		name[1]="ramesh";
		name[2]="dhruv";

		double height[]=new double[3];
		height[0]=5.2;
		height[1]=5.6;
		height[2]=3.6;
		
		char section[]=new char[3];
		section[0]='A';
		section[1]='B';
		section[2]='C';
		
		boolean male[]=new boolean[3];
		male[0]=false;
		male[1]=true;
		male[2]=true;
		
		for(int i=0;i<3;i++)
		{
		
	System.out.println("name->"+name[i] +", height-> "+height[i]+ ", roll number->"+roll_no[i]+", section->"+ section[i]+", is gender male? "+male[i]);			
	
	

	}
	}
}
