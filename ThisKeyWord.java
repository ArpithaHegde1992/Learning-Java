package assignments;
//assignment 64
//thiskey word


public class ThisKeyWord
{
int age;	
double salary;
String name;
static int ht=8;
void logic(int age,double salary,String name ) 
{
	 int ht=55;
this.ht=ht;	
this.age=age;
}
	public static void main(String[] args) {
		System.out.println("Test");
	ThisKeyWord a=new ThisKeyWord();
	a.logic(43, 5766680, "dryu");
	System.out.println(a.age);
 System.out.println(a.ht);
	}

}
