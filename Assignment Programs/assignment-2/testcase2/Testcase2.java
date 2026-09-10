package task3;



interface Academic
{
    void displayAcademic();
}

interface Sports
{
    void displaySports();
}

class Student implements Academic, Sports
{
    public void displayAcademic()
    {
        System.out.println("This is Academic interface");
    }

    public void displaySports()
    {
        System.out.println("This is Sports interface");
    }

    void displayStudent()
    {
        System.out.println("This is Student class");
    }
}

public class testcase2{
    public static void main(String[] args)
    {
        Student obj = new Student();

        // Test Case 1
        System.out.println("Test Case 1:");
        obj.displayStudent();

        // Test Case 2
        System.out.println("\nTest Case 2:");
        obj.displayAcademic();

        // Test Case 3
        System.out.println("\nTest Case 3:");
        obj.displaySports();

        // Test Case 4
        System.out.println("\nTest Case 4:");
        obj.displayStudent();
        obj.displayAcademic();

        // Test Case 5
        System.out.println("\nTest Case 5:");
        obj.displayStudent();
        obj.displayAcademic();
        obj.displaySports();
    }
}