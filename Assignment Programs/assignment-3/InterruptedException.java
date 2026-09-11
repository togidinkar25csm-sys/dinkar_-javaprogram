package name;

public class InterruptedExceptionExample
{
    public static void main(String[] args)
    {
        Thread t = new Thread(() ->
        {
            try
            {
                System.out.println("Thread is sleeping...");

                Thread.sleep(5000);

                System.out.println("Thread completed.");
            }
            catch (InterruptedException e)
            {
                System.out.println("InterruptedException occurred!");
                System.out.println("Thread was interrupted.");
            }
        });

        t.start();

        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted.");
        }

        t.interrupt();
    }
}
