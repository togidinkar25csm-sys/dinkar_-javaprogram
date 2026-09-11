package name;


public class ArrayIndexExample
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};

        try
        {
            System.out.println("Element at index 2: " + numbers[2]);
            System.out.println("Element at index 5: " + numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Invalid array index.");
        }
    }
}
