import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executor demo.
 */
public class multithread_example2
{
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new PrintChar3('a', 100));
        executor.execute(new PrintChar3('b', 100));
        executor.execute(new PrintNum3(100));

        executor.shutdown();
    }
}

// The task for printing a specified character in specified times
class PrintChar3 implements Runnable
{
    private char charToPrint; // The character to print
    private int times; // The times to repeat

    /** Construct a task with specified character and number of
     *  times to print the character
     */
    public PrintChar3(char c, int t)
    {
        charToPrint = c;
        times = t;
    }

    @Override /** Override the run() method to tell the system
     *  what the task to perform
     */
    public synchronized void run()
    {
        for (int i = 0; i < times; i++)
        {
            System.out.print(charToPrint);
        }
    }
}

// The task class for printing number from 1 to n for a given n
class PrintNum3 implements Runnable
{
    private int lastNum;

    /** Construct a task for printing 1, 2, ... i */
    public PrintNum3(int n)
    {
        lastNum = n;
    }

    @Override /** Tell the thread how to run */
    public synchronized void run()
    {
        for (int i = 1; i <= lastNum; i++)
        {
            System.out.print(" " + i);
        }
    }
}
