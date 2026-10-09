package myprog;






abstract class A {
 int x = 10;
 int access = 1234;


 abstract void add();


 void mul() {
     System.out.println("Mul: " + (x * 2));
 }
}


class B extends A {
 int y = 200;

 
 @Override
 void add() {
     int l = 3, m = 4;
     System.out.println("Add from subclass: " + (l + m + 100));
 }

 void sub() {
     System.out.println("Sub from subclass: " + (y - 20));
 }


 void mul(int b) {
     System.out.println("Mul in subclass: " + (x * b));
 }
}


public class Bash {
 public static void main(String[] args) {

     
     A obj = new B();

     System.out.println("Variable x: " + obj.x);
     System.out.println("Access: " + obj.access);

     obj.add();   
     obj.mul();   

     
     B obj2 = new B();
     obj2.sub();
     obj2.mul(20);
 }
}