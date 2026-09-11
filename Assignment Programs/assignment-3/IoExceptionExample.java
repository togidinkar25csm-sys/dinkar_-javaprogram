package name;

import java.io.*;

public class IOExceptionExample
{
    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader("sample.txt");

            int ch;

            while ((ch = file.read()) != -1)
            {
                System.out.print((char) ch);
            }

            file.close();
        }
        catch (IOException e)
        {
            System.out.println("IOException occurred!");
            System.out.println("Error while reading the file.");
        }
    }
}
