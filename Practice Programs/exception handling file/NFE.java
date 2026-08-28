package inheritance;





public class NFE {
	    public static void main(String[] args) {
	        String inputData = "100g"; // Contains the letter 'g'

	      try {  // This line will crash the program with a NumberFormatException
	        int score = Integer.parseInt(inputData); 
	        System.out.println("The score is: " + score);}catch(NumberFormatException NFE) {
	        	
	        	System.out.println("don't enter character with interger :");
	        }
	    
	      System.out.println("sweet :");
	      System.out.println(" om :");
	    }
}