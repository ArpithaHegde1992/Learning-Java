package assignments;

//assignment 62

//method overriding

// two classes should have a relation//
//methods should be nonstatic//
//methods should have same name & return type& parameters but differ in class in body//
class Method2
{
	
void login() 
{
System.out.println("Login to amazon using mobile no");	
}
}
public class MethodOverriding extends Method2
{
void login() 
{
System.out.println("Login to amazon using email id");	
}

	public static void main(String[] args) {
	

		
	//so here parent class supresses by child class.this is overriding
		//so we use super, thiskeywords//
		
 MethodOverriding a =new MethodOverriding();
 a.login();
	}

}
