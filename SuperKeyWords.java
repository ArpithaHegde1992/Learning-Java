package assignments;

//assignment 63
//super keyword
 class Super
 {
public  void login (int a,int b)
{
	System.out.println("login to amazon");
}
 }
public class SuperKeyWords extends Super
{
	public void login (int a,int b)
	{
		
		System.out.println("login to facebook");
		super.login(0, 7);//superkeyword be anyline//if it first line parent execute//
//if it is last child class execute first//	
	}
	public static void main(String[] args) {
		SuperKeyWords a=new SuperKeyWords();
		a.login(3,7);

	}

}
