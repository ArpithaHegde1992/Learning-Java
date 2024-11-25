package assign2;
class Amazon


// Assignment 93

{
	
private	String un="arparp";
//generate getter setter right click-source-un(.)-generate

public String getUn() {
	return un;
}

public void setUn(String un) {
	this.un = un;
}
}


public class EncapsulationProblems {

	public static void main(String[] args) {
		
  Amazon a =new Amazon();
   a.setUn("hththth");// setter getter is used to update the username and pwd.
   System.out.println(a.getUn());
	}

}
