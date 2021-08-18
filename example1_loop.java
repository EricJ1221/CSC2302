/**
 * Print message n times
 */
public class example1_loop
{
    public static void main(String[] args)
    {
        //Print the string a number of times
        print("Hello World", 5);
    }

    public static void print(String s, int num)
    {
        if(num > 0)
        {
            System.out.println(s);
            print(s, num - 1);
        }
    }
}
