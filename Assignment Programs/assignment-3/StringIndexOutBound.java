package name;

public class StringIndexExample
{
    public static void main(String[] args)
    {
        String name = "Dinkar";

        try
        {
            System.out.println("Character at index 2: " + name.charAt(2));
            System.out.println("Character at index 10: " + name.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException occurred!");
            System.out.println("Invalid String index.");
        }
    }
}
