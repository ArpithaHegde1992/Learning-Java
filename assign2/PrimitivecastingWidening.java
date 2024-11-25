package assign2;

public class PrimitivecastingWidening {

	//assignment 98
	
	public static void main(String[] args) {
		// widening
		//converting int to double
		int a=100;
		double b=a;//implicitly
		System.out.println(b);

		int a1=100;
		double b2=(double) a1;//explicitly
		System.out.println(b2);
	}

}
