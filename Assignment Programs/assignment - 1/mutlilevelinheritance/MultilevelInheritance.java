package task2;

import java.util.Scanner;

//Level 1 - Parent class
class Venu {
 String name;
 int rollNo;

 void getStudentDetails(String name, int rollNo) {
     this.name = name;
     this.rollNo = rollNo;
 }
}

//Level 2 - Inherits Student
class Marks extends Venu {
 int marks;

 void getMarks(int marks) {
     this.marks = marks;
 }
}

//Level 3 - Inherits Marks
class Bull extends Marks {

 void displayResult() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNo);
     System.out.println("Marks: " + marks);

     if (marks >= 35) {
         System.out.println("Result: Pass");
     } else {
         System.out.println("Result: Fail");
     }
 }
}

//Main class
public class MultilevelInheritance {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of test cases: ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 1; i <= n; i++) {

         System.out.println("\n----- Test Case " + i + " -----");

         System.out.print("Enter student name: ");
         String name = sc.nextLine();

         System.out.print("Enter roll number: ");
         int rollNo = sc.nextInt();

         System.out.print("Enter marks: ");
         int marks = sc.nextInt();
         sc.nextLine();

         // Creating object of the last class
         Bull r = new Bull();

         // Calling methods from all three levels
         r.getStudentDetails(name, rollNo);
         r.getMarks(marks);
         r.displayResult();
     }

     sc.close();
 }
}