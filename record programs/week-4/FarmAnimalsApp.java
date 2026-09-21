package task1;


class Animal {
    protected String name;
    protected int age;
    protected String sound;

    // Constructor
    Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    // Default sound
    public void makeSound() {
        System.out.println(name + " makes a sound: " + sound);
    }

    // Eating behavior
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Display animal info
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age + " years");
    }
}


// Cow class
class Cow extends Animal {
    private double milkYield; // litres per day

    Cow(String name, int age, double milkYield) {
        super(name, age, "Moo");
        this.milkYield = milkYield;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Moo!");
    }

    public void produceMilk() {
        System.out.println(name + " produces " + milkYield + " litres of milk today.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Milk Yield : " + milkYield + " L/day");
    }
}


// Hen class
class Hen extends Animal {
    private int eggsPerWeek;

    Hen(String name, int age, int eggsPerWeek) {
        super(name, age, "Cluck");
        this.eggsPerWeek = eggsPerWeek;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Cluck cluck!");
    }

    public void layEggs() {
        System.out.println(name + " lays " + eggsPerWeek + " eggs this week.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Eggs/Week  : " + eggsPerWeek);
    }
}


// Sheep class
class Sheep extends Animal {
    private double woolWeight; // kg per shearing

    Sheep(String name, int age, double woolWeight) {
        super(name, age, "Baa");
        this.woolWeight = woolWeight;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Baa!");
    }

    public void produceWool() {
        System.out.println(name + " produces " + woolWeight + " kg of wool.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wool Weight: " + woolWeight + " kg");
    }
}


// Main class
public class FarmAnimalsApp {
    public static void main(String[] args) {

        // Creating objects
        Cow cow = new Cow("Bessie", 4, 12.5);
        Hen hen = new Hen("Clucky", 1, 6);
        Sheep sheep = new Sheep("Dolly", 3, 3.2);

        System.out.println("===== COW =====");
        cow.displayInfo();
        cow.makeSound();
        cow.eat();
        cow.produceMilk();

        System.out.println("\n===== HEN =====");
        hen.displayInfo();
        hen.makeSound();
        hen.eat();
        hen.layEggs();

        System.out.println("\n===== SHEEP =====");
        sheep.displayInfo();
        sheep.makeSound();
        sheep.eat();
        sheep.produceWool();

        System.out.println("\n===== POLYMORPHISM DEMO =====");
        Animal[] farmAnimals = { cow, hen, sheep };
        for (Animal a : farmAnimals) {
            a.makeSound(); // calls overridden version for each object
        }
    }
}
