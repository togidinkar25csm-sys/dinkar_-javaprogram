package task2;

import java.util.Scanner;

//Parent class
class Student {
 String name;
 int marks;

 void getStudentDetails(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }
}

//Child class
class Result extends Student {

 void displayResult() {
     System.out.println("Student Name: " + name);
     System.out.println("Marks: " + marks);

     if (marks >= 35) {
         System.out.println("Result: Pass");
     } else {
         System.out.println("Result: Fail");
     }
 }
}

//Main class
public class Singleinheritance {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of test cases: ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 1; i <= n; i++) {

         System.out.println("\n----- Test Case " + i + " -----");

         System.out.print("Enter student name: ");
         String name = sc.nextLine();

         System.out.print("Enter marks: ");
         int marks = sc.nextInt();
         sc.nextLine();

         // Creating child class object
         Result r = new Result();

         // Calling inherited method
         r.getStudentDetails(name, marks);

         // Calling child class method
         r.displayResult();
     }

     sc.close();
 }
}