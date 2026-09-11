package name;

import java.io.*;

public class FileNotFoundExample
{
    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader("student.txt");

            System.out.println("File opened successfully.");

            file.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException occurred!");
            System.out.println("The file was not found.");
        }
        catch (IOException e)
        {
            System.out.println("IOException occurred!");
        }
    }
}
