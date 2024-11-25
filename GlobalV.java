package assignments;

public class GlobalV {
	//assignment 50
	
	int employeeid;
	double salary;  //all are global
	String name;
	
	final int b=30;//final v
	
	void employee_details(int employeeid,double salary,String name)//local v
	{
System.out.println("Hello");
}
	public static void main(String[] args) {

		GlobalV a =new GlobalV();
		a.employee_details(67, 8798.88, "arpita");//local variable so hello output
		
		System.out.println(a.salary); //global
		System.out.println(a.employeeid);//global
		System.out.println(a.name);//global ,no values declared so default
		System.out.println(a.b);//final
		
}}