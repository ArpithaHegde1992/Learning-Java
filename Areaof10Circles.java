package assignments;
// assignment 23
//find area os 10 circles using random r bn 0 and 1
public class Areaof10Circles {
	
final static double pi=Math.PI;

	public static void main(String[] args) 
	{
		for (int i=0; i<10;i++)
		{
		double r=Math.random();
 double area = pi*r*r;
 System.out.println("#"+i+" For r="+r+", Area is="+area);  
 
	}

}
	}
