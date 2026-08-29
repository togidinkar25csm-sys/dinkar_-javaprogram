
package task2;

//Parent class
class Parent {

 void show() {
     System.out.println("This is from Parent class");
 }
}

//Child1 inherits Parent
class Child1 extends Parent {

 void addition() {
     System.out.println("Addition is: " + (20 + 30));
 }
}

//Child2 also inherits Parent
class Child2 extends Parent {

 void multiplication() {
     System.out.println("Multiplication is: " + (20 * 30));
 }
}

//Hierarchical Inheritance:
//Multiple child classes inherit from the same parent class.
public class HierarchicalInheritance {

 public static void main(String[] args) {

     Child1 obj1 = new Child1();
     Child2 obj2 = new Child2();

     // Child1 accesses Parent method
     obj1.show();
     obj1.addition();

     // Child2 accesses Parent method
     obj2.show();
     obj2.multiplication();
 }
}