import java.util.Scanner;
public class simpleinterest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        float amount = in.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float rate = in.nextFloat();
        int time = 5;
        float interest = amount * time * rate / 100;
        rate = amount * rate /100;
        System.out.printf("\nInitial investment: %f.\nInterest in 5 years: %f.\n", amount, interest);
        for (int i = 1; i <= 5; i++) //display value of investment at the end of every year for 5 years
             System.out.printf("\nThe value of investment at the end of year %d: %.2f.", i, amount + rate * i);
        in.close();
    }
}