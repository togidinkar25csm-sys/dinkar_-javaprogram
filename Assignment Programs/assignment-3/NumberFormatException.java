package name;

public class NumberFormatExample
{
    public static void main(String[] args)
    {
        String value = "ABC";

        try
        {
            int number = Integer.parseInt(value);
            System.out.println("Number: " + number);
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException occurred!");
            System.out.println("Invalid number format.");
        }
    }
}
