package task1;


    





//---------- Part A & B : Classes, Objects, Constructors, Encapsulation ----------

class Book {

 private int bookId;
 private String bookName;
 private String author;
 private double price;

 // Default Constructor
 Book() {
     bookId = 0;
     bookName = "Unknown";
     author = "Unknown";
     price = 0.0;
 }

 // Parameterized Constructor
 Book(int bookId, String bookName, String author, double price) {
     this.bookId = bookId;
     this.bookName = bookName;
     this.author = author;
     this.price = price;
 }

 // Getters
 public int getBookId() {
     return bookId;
 }

 public String getBookName() {
     return bookName;
 }

 public String getAuthor() {
     return author;
 }

 public double getPrice() {
     return price;
 }

 // Setters
 public void setBookId(int bookId) {
     this.bookId = bookId;
 }

 public void setBookName(String bookName) {
     this.bookName = bookName;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 // Display Book Details
 public void displayBook() {
     System.out.println("Book ID   : " + bookId);
     System.out.println("Book Name : " + bookName);
     System.out.println("Author    : " + author);
     System.out.println("Price     : " + price);
 }
}


//---------- Part C : Inheritance ----------

class Person {

 protected String name;
 protected int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayPerson() {
     System.out.println("Name : " + name);
     System.out.println("Age  : " + age);
 }
}


//Student inherits Person
class Student extends Person {

 private int rollNumber;

 Student(String name, int age, int rollNumber) {
     super(name, age);
     this.rollNumber = rollNumber;
 }

 public void displayStudent() {
     displayPerson();
     System.out.println("Roll Number : " + rollNumber);
 }
}


//Faculty inherits Person
class Faculty extends Person {

 private String subject;

 Faculty(String name, int age, String subject) {
     super(name, age);
     this.subject = subject;
 }

 public void displayFaculty() {
     displayPerson();
     System.out.println("Subject : " + subject);
 }
}


//---------- Part D : Method Overloading ----------

class AreaCalculator {

 // Area of Circle
 public double area(double radius) {
     return Math.PI * radius * radius;
 }

 // Area of Rectangle
 public double area(double length, double breadth) {
     return length * breadth;
 }

 // Area of Square
 public double area(int side) {
     return side * side;
 }
}


//---------- Part D : Method Overriding ----------

class Vehicle {

 public void display() {
     System.out.println("This is a Vehicle");
 }
}


//Car overrides display()
class Car extends Vehicle {

 @Override
 public void display() {
     System.out.println("This is a Car");
 }
}


//Bike overrides display()
class Bike extends Vehicle {

 @Override
 public void display() {
     System.out.println("This is a Bike");
 }
}


//---------- Part E : Abstraction ----------

abstract class Shape {

 abstract void draw();
}


//Circle implements abstract method
class Circle extends Shape {

 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }
}


//Rectangle implements abstract method
class Rectangle extends Shape {

 @Override
 void draw() {
     System.out.println("Drawing a Rectangle");
 }
}


//---------- Part E : Interface ----------

interface Printable {

 void print();
}


//Report implements Printable
class Report implements Printable {

 @Override
 public void print() {
     System.out.println("Printing Library Report...");
 }
}


//---------- Main Class ----------

public class LibraryManagementSystem {

 public static void main(String[] args) {

     System.out.println("======================================");
     System.out.println("       LIBRARY MANAGEMENT SYSTEM");
     System.out.println("======================================");


     // ---------- Part A : Classes and Objects ----------

     System.out.println("\n--- Part A: Classes and Objects ---");

     Book book1 = new Book();
     Book book2 = new Book(
             101,
             "Java Programming",
             "James Gosling",
             550.00
     );

     System.out.println("\nBook 1 Details:");
     book1.displayBook();

     System.out.println("\nBook 2 Details:");
     book2.displayBook();


     // ---------- Part B : Encapsulation ----------

     System.out.println("\n--- Part B: Encapsulation ---");

     book1.setBookId(102);
     book1.setBookName("Object Oriented Programming");
     book1.setAuthor("Herbert Schildt");
     book1.setPrice(650.00);

     System.out.println("\nBook 1 Details After Using Setters:");
     System.out.println("Book ID   : " + book1.getBookId());
     System.out.println("Book Name : " + book1.getBookName());
     System.out.println("Author    : " + book1.getAuthor());
     System.out.println("Price     : " + book1.getPrice());


     // ---------- Part C : Inheritance ----------

     System.out.println("\n--- Part C: Inheritance ---");

     Student student = new Student(
             "Rahul",
             19,
             101
     );

     System.out.println("\nStudent Details:");
     student.displayStudent();


     Faculty faculty = new Faculty(
             "Dr. Kumar",
             40,
             "Java Programming"
     );

     System.out.println("\nFaculty Details:");
     faculty.displayFaculty();


     // ---------- Part D : Method Overloading ----------

     System.out.println("\n--- Part D: Method Overloading ---");

     AreaCalculator calculator = new AreaCalculator();

     System.out.println("Area of Circle = "
             + calculator.area(5.0));

     System.out.println("Area of Rectangle = "
             + calculator.area(10.0, 5.0));

     System.out.println("Area of Square = "
             + calculator.area(5));


     // ---------- Part D : Method Overriding ----------

     System.out.println("\n--- Part D: Method Overriding ---");

     Vehicle vehicle;

     vehicle = new Car();
     vehicle.display();

     vehicle = new Bike();
     vehicle.display();


     // ---------- Part E : Abstraction ----------

     System.out.println("\n--- Part E: Abstraction ---");

     Shape circle = new Circle();
     Shape rectangle = new Rectangle();

     circle.draw();
     rectangle.draw();


     // ---------- Part E : Interface ----------

     System.out.println("\n--- Part E: Interface ---");

     Printable report = new Report();
     report.print();


     System.out.println("\n======================================");
     System.out.println("       PROGRAM COMPLETED");
     System.out.println("======================================");
 }
}