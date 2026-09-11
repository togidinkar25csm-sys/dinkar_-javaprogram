package name;

public class ClassNotFoundExample
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("Student");
            System.out.println("Class found successfully.");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundException occurred!");
            System.out.println("The specified class was not found.");
        }
    }
}
