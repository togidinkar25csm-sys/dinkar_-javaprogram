package inheritance;

public class WithTry {
	public static void main (String[]args) {
		int x=10 ,y=0;
		
		
		
		try {
		int k =x/y;
		System.out.println("the value of k : " +k );
		}catch(ArithmeticException ae) {
			
			System.out.println(" don't give zero in denominator " );
		}
		
		
		
			
		System.out.println("the main is heavy  " );
		System.out.println("the happy day  "  );
	}

}
 