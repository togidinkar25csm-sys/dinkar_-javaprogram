
package task2;

import java.util.Scanner;

//Parent class
class Anu{
 String name;
 int rollNo;
 int marks;

 void getStudentDetails(String name, int rollNo, int marks) {
     this.name = name;
     this.rollNo = rollNo;
     this.marks = marks;
 }

 void displayStudentDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNo);
     System.out.println("Marks: " + marks);
 }
}

//Child class 1
class Engineering extends Anu {

 void displayEngineeringResult() {
     displayStudentDetails();

     if (marks >= 35) {
         System.out.println("Engineering Result: Pass");
     } else {
         System.out.println("Engineering Result: Fail");
     }
 }
}

//Child class 2
class Management extends Anu{

 void displayManagementResult() {
     displayStudentDetails();

     if (marks >= 35) {
         System.out.println("Management Result: Pass");
     } else {
         System.out.println("Management Result: Fail");
     }
 }
}

//Main class
public class HierarchicalInheritance {

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

         System.out.print("Enter course (1-Engineering, 2-Management): ");
         int course = sc.nextInt();
         sc.nextLine();

         if (course == 1) {

             // Object of Engineering child class
             Engineering e = new Engineering();

             e.getStudentDetails(name, rollNo, marks);
             e.displayEngineeringResult();

         } else if (course == 2) {

             // Object of Management child class
             Management m = new Management();

             m.getStudentDetails(name, rollNo, marks);
             m.displayManagementResult();

         } else {

             System.out.println("Invalid course!");
         }
     }

     sc.close();
 }
}