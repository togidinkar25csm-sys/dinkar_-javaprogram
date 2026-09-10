// C1 implements I1, I2
// Aim: To demonstrate how a Java class can implement multiple interfaces using the "implements" keyword.

interface I1
{
    void displayStudent();
}

interface I2
{
    void displayCollege();
}

public class C1 implements I1, I2
{
    public void displayStudent()
    {
        System.out.println("Student details displayed");
    }

    public void displayCollege()
    {
        System.out.println("College details displayed");
    }

    public static void main(String[] args)
    {
        C1 obj = new C1();

        // Test Case 1
        System.out.println("Test Case 1:");
        obj.displayStudent();

        // Test Case 2
        System.out.println("\nTest Case 2:");
        obj.displayCollege();

        // Test Case 3
        System.out.println("\nTest Case 3:");
        obj.displayStudent();
        obj.displayCollege();
    }
}
