package task2;

// Parent class
class Parent {

    void parentMethod() {
        System.out.println("This is from Parent class");
    }
}

// Child1 inherits Parent
class Child1 extends Parent {

    void child1Method() {
        System.out.println("This is from Child1");
    }
}

// Interface 1
interface A {

    void methodA();
}

// Interface 2
interface B {

    void methodB();
}

// Hybrid Inheritance:
// Class inheritance + multiple interfaces.
public class HybridInheritance extends Child1 implements A, B {

    // Implementing Interface A
    public void methodA() {
        System.out.println("This is from Interface A");
    }

    // Implementing Interface B
    public void methodB() {
        System.out.println("This is from Interface B");
    }

    public static void main(String[] args) {

        HybridInheritance obj = new HybridInheritance();

        // Inherited from Parent
        obj.parentMethod();

        // Inherited from Child1
        obj.child1Method();

        // Methods from interfaces
        obj.methodA();
        obj.methodB();
    }
}