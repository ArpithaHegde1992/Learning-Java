package assignments;

import java.util.Date;

public class PresentPastFutertime {

	public static void main(String[] args) {
		// assignment 37,38,39
		
	//current time
		
 Date d1=new Date();
 System.out.println(d1.getTime());//using epoch convertr we can convert to human readable

  Date d2= new Date( d1.getTime()); //parameterized constructor
  System.out.println(d2);
  
  String current_time  =d2.toString(); //convert to string
 String year=  current_time.substring(current_time.length()-4);//make year out
 System.out.println(year);
 
 String month=current_time.substring(4, 7);//month out
 System.out.println(month);
 
 String date=current_time.substring(8, 10);
 System.out.println(date);//date out
 
 String date_format=date.concat("/").concat(month).concat("/").concat(year);
 System.out.println(date_format);
 
 //future time
 
 Date d3=new Date(d1.getTime() + (1000*60*60*24*1));//*1 means tomarrow
 System.out.println(d3);
 String future=d3.toString();
 
 System.out.println(future);
String year1= future.substring(future.length()-4);
 System.out.println(year);
 
 String month1=future.substring(4, 7);
 System.out.println(month);
 
 String date1 = future.substring(8, 10);
 System.out.println(date1);
 
 String FutureDate=date1.concat("-").concat(month1).concat("-").concat(year1);
 System.out.println(FutureDate);
 
 // past 
 Date d4=new Date(d1.getTime() - (1000*60*60*24*1));//
 System.out.println(d4);
 String past=d4.toString();
 
 System.out.println(future);
String year2= past.substring(past.length()-4);
 System.out.println(year2);
 
 String month2=past.substring(4, 7);
 System.out.println(month2);
 
 String date2 = past.substring(8, 10);
 System.out.println(date2);
 
 String pastDate=date2.concat("-").concat(month2).concat("-").concat(year2);
 System.out.println(pastDate);
 
 
 
 
 
 
 
 
 
	}

}
