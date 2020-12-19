import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        final int n = in.nextInt();
        if (n == 0 || n == 1)
        {
            System.out.println(n + " is not prime number.");
        }
        else
        {
            // check if n is divisible by all numbers till n/2
            for (int i = 2; i <= n / 2; i++)
            {
                if (n % i == 0)
                {
                    System.out.println(n + " is not prime number.");
                    flag = true;
                    break;
                }
            }
            if (flag == false)
            {
                System.out.println(n + " is a prime number.");
            }
        } // end of else
        in.close();
    }
}