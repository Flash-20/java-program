import java.util.Scanner;
public class vowels
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a line of text to find vowels: ");
        String line = in.nextLine();
        for (int i = 0; i < line.length(); i++)
        {
            final char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            count++;  //incriment happens if count encounters a vowel
        }
        System.out.printf("There are %d vowels in your sentence.\n",count);
        in.close();
    }
}