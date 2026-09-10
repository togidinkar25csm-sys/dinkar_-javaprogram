package task3;

interface I1
{
    void display();
}

public class C1 implements I1
{
    public void display()
    {
        System.out.println("This is the method of I1 interface");
    }

    public static void main(String[] args)
    {
        C1 obj = new C1();

        System.out.println("Test Case 1:");
        obj.display();

        System.out.println("\nTest Case 2:");
        obj.display();

        System.out.println("\nTest Case 3:");
        obj.display();
    }
}
