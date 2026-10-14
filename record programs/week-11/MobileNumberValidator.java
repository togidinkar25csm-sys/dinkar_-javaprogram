package crits;

import java.util.Scanner;

//User-defined exception
class LengthNotSufficientException extends Exception {
 LengthNotSufficientException(String message) {
     super(message);
 }
}

public class MobileNumberValidator {

 // Validates the mobile number
 static void validate(String number)
         throws LengthNotSufficientException {

     // 1. Check for non-digit characters
     for (int i = 0; i < number.length(); i++) {
         char c = number.charAt(i);
         if (c < '0' || c > '9') {
             throw new NumberFormatException(
                     "Number contains non-digit characters");
         }
     }

     // 2. Length greater than 10
     if (number.length() > 10) {
         throw new ArrayIndexOutOfBoundsException(
                 "Number exceeds 10 digits");
     }

     // 3. Length less than 10
     if (number.length() < 10) {
         throw new LengthNotSufficientException(
                 "Number has fewer than 10 digits");
     }

     System.out.println("Valid number");
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter mobile number: ");
     String number = sc.next();

     try {
         validate(number);
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println(
             "Invalid Mobile Number-ArrayIndexOutofBounds Exception");
     } catch (LengthNotSufficientException e) {
         System.out.println(
             "Invalid Mobile Number - LengthNotSufficientException");
     } catch (NumberFormatException e) {
         System.out.println(
             "Invalid Mobile Number - NumberFormatException");
     } finally {
         System.out.println("Validation completed.");
         sc.close();
     }
 }
}



