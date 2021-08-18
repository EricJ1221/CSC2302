/**
 *  Thread Synchronization
 */

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class multithread_example3
{
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i = 0; i < 100; i++)
            executor.execute(new AddAPennyTask());

        executor.shutdown();

        while(!executor.isTerminated())
        {}

        System.out.println("What is balance? " + Account.getBalance());
    }
}

class AddAPennyTask implements Runnable
{
    public void run()
    {
        Account.deposit(1);
    }
}

class Account
{
    private static int balance = 0;
    private static Lock lock = new ReentrantLock();

    public static int getBalance()
    {
        return balance;
    }

    ///No Synchronization
    public static void deposit(int i)
    {
        int newbalance = balance + i;
        try
        {
            Thread.sleep(0);

        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        balance = newbalance;
    }

    ///Synchronization without locks
/*
    public static synchronized void deposit(int i)
    {
        int newbalance = balance + i;
        try
        {
            Thread.sleep(0);

        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        balance = newbalance;
    }
*/

    ///Synchronization with locks
    /*
    public static void deposit(int i)
    {
        lock.lock();
        try
        {
            int newbalance = balance + i;
            Thread.sleep(1);
            balance = newbalance;
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }*/

}