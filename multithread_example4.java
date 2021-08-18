/**
 * Thread Cooperation
 */

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class multithread_example4
{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new DespositTask());
        executor.execute(new WithdrawTask());
        executor.shutdown();

        System.out.println("Thread 1\t\tThread 2\t\tBalance ");
    }
}

class DespositTask implements Runnable
{
    public void run()
    {
        try{
            while(true)
            {
                Account2.deposit((int)(Math.random() * 10)+1);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}

class WithdrawTask implements Runnable
{
    public void run()
    {
        while(true)
        {
            Account2.withdraw((int)(Math.random() * 10) + 1);
        }
    }
}

class Account2
{
    private static Lock lock = new ReentrantLock();
    private static Condition newDeposit = lock.newCondition();

    private static int balance = 0;

    public static int getBalance()
    {
        return balance;
    }

    public static void withdraw(int amount)
    {
        lock.lock();
        try
        {
            while(balance < amount)
            {
                System.out.println("\t\t\tWait for a deposit");
                newDeposit.await();
            }
            balance -= amount;
            System.out.println("\t\t\tWithdraw " + amount + "\t\t\t\t" + getBalance());
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public static void deposit(int amount)
    {
        lock.lock();
        try
        {
            balance += amount;
            System.out.println("Deposit " + amount + "\t\t\t\t\t\t\t" + getBalance());

            newDeposit.signalAll();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}