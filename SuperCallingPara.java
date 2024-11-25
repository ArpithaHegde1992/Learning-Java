package assignments;
class Animals

// assignment 60

//supercalling
{//parameterized constructor should be explicit

Animals(double b)
{
System.out.println("3");
}

}
class Birds extends Animals
{

	Birds()
	{
	super(4.6);
	System.out.println("2");	
	}
}
public class SuperCallingPara extends Birds
{
	//Bird()is non para constructor so no need to implicit super
	SuperCallingPara(int a)
	{
		System.out.println("1");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new SuperCallingPara(6);
	}

}
