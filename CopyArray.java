package assignments;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		// assignment 35
		
		
int rol[]=new int[2];
rol[0]=6;
rol[1]=4;

int rol2[]=new int[2];

for(int i=0;i<2;i++)
{
	rol2[i]=rol[i];
	System.out.println(rol2[i]);
}
	System.out.println(Arrays.toString(rol));	
	System.out.println(Arrays.toString(rol2));
	}

}
