package inheritance;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TryMultipleCatch {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int x ,y;
		
		
		try {
			System.out.println("enter  value of x :"  );
			x = sc.nextInt();
			
			System.out.println("enter value of y:");
			y = sc.nextInt();
			
			
		int k =x/y;
		System.out.println("the value of k : " +k );
		}catch(ArithmeticException ae) {
			
			System.out.println(" don't give zero in denominator " );
		}catch(InputMismatchException IME) {
			System.out.println("enter only number not symbol and charater warning");
			
		}
		
		
		
			
		System.out.println("the main is heavy  " );
		System.out.println("the happy day  "  );
		sc.close();
	}

}
 
