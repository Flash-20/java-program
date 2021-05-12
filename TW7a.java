package tw7a;
import java.util.Scanner;

interface prime
{
    abstract boolean isPrime(int a);
}

class PrimeTester implements prime
{
    @Override
    public boolean isPrime(int a)
    {
        int flag =0;
        for(int x=2;x<a-1;x++)
        {
            if(a%x==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }
}
class ImprPrimeTester implements prime {
    @Override
    public boolean isPrime(int a)
    {
        int flag=0;
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false ;
    }
}
class FasterPrimeTester implements prime {
    @Override
    public boolean isPrime(int a)
    {
        int flag=0;
        for(int i=2;i<Math.sqrt(a);i++)
        {
            if(a%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
        return true;
    else
        return false ;
    }
}
class FastestPrimeTester implements prime {
    @Override
    public boolean isPrime(int n)
    {
        int flag=0;
        for(int a=1;a<n-1;a++)
        {
            if(Math.pow(a, n-1)%n!=1)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false ;
    }
}
public class TW7a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean res;
        Scanner in = new Scanner(System.in);
        PrimeTester p1 = new PrimeTester();
        System.out.println("Enter a number:");
        int a=in.nextInt();
        res = p1.isPrime(a);
        System.out.println("Checking a number is prime by iterating from 2 to n1");
        if(res)
            System.out.println("Entered number is prime number");
        else
            System.out.println("Entered number is not a prime number");
        
        ImprPrimeTester p2 = new ImprPrimeTester();
        res = p2.isPrime(a);
        System.out.println("Checking a number is prime by iterating from 2 to n/2");
        if(res)
            System.out.println("Entered number is prime number");
        else
            System.out.println("Entered number is not a prime number");
    
        FasterPrimeTester p3 = new FasterPrimeTester();
        res = p3.isPrime(a);
        System.out.println("Checking a number is prime by iterating from 2 to square root of n");
        if(res)
            System.out.println("Entered number is prime number");
        else
            System.out.println("Entered number is not a prime number"); 
    
        FastestPrimeTester p4 = new FastestPrimeTester();
        res = p4.isPrime(a);
        System.out.println("Checking a number is prime by using Fermat Little Theorem");
        if(res)
            System.out.println("Entered number is prime number");
        else
            System.out.println("Entered number is not a prime number");
    }
    
}
