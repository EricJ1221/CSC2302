/**
 * Factorial.
 */
public class Example2_factorial
{
    public static void main(String[] args)
    {
        int solution = factorial(10);
        System.out.println(solution);
    }

    //Factorial method.  We call factorial each time reducing the number by one.
    //Each call of the factorial is computing the factorial of that number.
    //This is saying n! = n * (n - 1)!
    public static int factorial(int num)
    {
        //0! = 1
        if(num == 0)
            return 1;
        else
        {
            //n! = n * (n - 1)!
            int solution = num * factorial(num - 1);
            return solution;
        }
    }
}
