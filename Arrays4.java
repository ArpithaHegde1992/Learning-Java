package assignments;

public class Arrays4 {

	//assignment 44
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//tere is array of size 5 of int datatype and just check if 34 is present in array or not
		//how to find index of 34
		
		int roll[]=new int[5];
		roll[0]=67;
		roll[1]=56;
		roll[2]=88;
		roll[3]=34;
		int notocheck=34;
		
		for(int i=0;i<4;i++) {
			if(notocheck==roll[i]) 
			{
				System.out.println("the number "+notocheck+ "is in the array");
				System.out.println(notocheck+ " index is "+ i);
			}
		
		}
		
	}

}
