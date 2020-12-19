import java.util.Scanner;
public class palindrome
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        s.close();
        for (int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i); //store reverse of input string in another variable
        }
        if (a.equalsIgnoreCase(b)) //check if the stored reverse is equal to the input string
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }    
}