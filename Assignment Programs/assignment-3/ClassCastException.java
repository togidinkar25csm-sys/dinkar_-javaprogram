package name;

class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat meows");
    }
}

public class ClassCastExample
{
    public static void main(String[] args)
    {
        Animal animal = new Dog();

        try
        {
            Cat cat = (Cat) animal;
            cat.meow();
        }
        catch (ClassCastException e)
        {
            System.out.println("ClassCastException occurred!");
            System.out.println("Object cannot be cast to Cat.");
        }
    }
}
