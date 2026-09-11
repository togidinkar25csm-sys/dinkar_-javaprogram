package name;

public class NullPointerExample
{
    public static void main(String[] args)
    {
        String name = null;

        try
        {
            System.out.println("Length of name: " + name.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException occurred!");
            System.out.println("String reference is null.");
        }
    }
}
