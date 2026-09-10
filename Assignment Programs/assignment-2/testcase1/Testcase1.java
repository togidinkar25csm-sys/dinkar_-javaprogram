package task3;


//Parent class
class C2 {
 String name;
 int age;

 void setDetails(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void showDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Interface
interface I1 {
 void showActivity();
}

//Child class C1
class C1 extends C2 implements I1 {

 public void showActivity() {
     System.out.println("Activity: Cricket");
 }

 void showC1() {
     showDetails();
     System.out.println("Type: C1");

     if (age >= 18) {
         System.out.println("Status: Adult");
     } else {
         System.out.println("Status: Minor");
     }

     showActivity();
 }
}

//Child class C3
class C3 extends C2 {

 void showC3() {
     showDetails();
     System.out.println("Type: C3");

     if (age >= 18) {
         System.out.println("Status: Adult");
     } else {
         System.out.println("Status: Minor");
     }
 }
}

//Main class
public class Testcase1 {

 public static void main(String[] args) {

     // Test Case 1
     System.out.println("----- Test Case 1 -----");

     C1 obj1 = new C1();
     obj1.setDetails("Ravi", 20);
     obj1.showC1();


     // Test Case 2
     System.out.println("\n----- Test Case 2 -----");

     C3 obj2 = new C3();
     obj2.setDetails("Priya", 22);
     obj2.showC3();


     // Test Case 3
     System.out.println("\n----- Test Case 3 -----");

     C1 obj3 = new C1();
     obj3.setDetails("Arun", 16);
     obj3.showC1();
 }
}


