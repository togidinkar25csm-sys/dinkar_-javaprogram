package task2;

import java.util.Scanner;

//First interface
interface Addition {
 int add(int a, int b);
}

//Second interface
interface Multiplication {
 int multiply(int a, int b);
}

//Class implementing two interfaces
class Chatain implements Addition, Multiplication {

 // Implementing Addition interface method
 public int add(int a, int b) {
     return a + b;
 }

 // Implementing Multiplication interface method
 public int multiply(int a, int b) {
     return a * b;
 }

 void displayResult(int a, int b) {
     System.out.println("First Number: " + a);
     System.out.println("Second Number: " + b);
     System.out.println("Addition: " + add(a, b));
     System.out.println("Multiplication: " + multiply(a, b));
 }
}

//Main class
public class MultipleInheritance {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of test cases: ");
     int n = sc.nextInt();

     for (int i = 1; i <= n; i++) {

         System.out.println("\n----- Test Case " + i + " -----");

         System.out.print("Enter first number: ");
         int a = sc.nextInt();

         System.out.print("Enter second number: ");
         int b = sc.nextInt();

         // Creating object of Student class
         Chatain s = new Chatain();

         // Calling methods from both interfaces
         s.displayResult(a, b);
     }

     sc.close();
 }
}