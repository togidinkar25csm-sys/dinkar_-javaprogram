package task2;

// First interface
interface Addition {

    void add();
}

// Second interface
interface Multiplication {

    void multiply();
}

// Multiple Inheritance:
// One class implements multiple interfaces.
public class MultipleInheritance implements Addition, Multiplication {

    // Implementing method of Addition interface
    public void add() {
        System.out.println("Addition is: " + (20 + 30));
    }

    // Implementing method of Multiplication interface
    public void multiply() {
        System.out.println("Multiplication is: " + (20 * 30));
    }

    public static void main(String[] args) {

        MultipleInheritance obj = new MultipleInheritance();

        obj.add();
        obj.multiply();
    }
}