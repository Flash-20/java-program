import java.util.Scanner;
public class words
{
    static int wordCount(String string)
    {
        int count = 0;
        char ch[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++)
        {
            ch[i] = string.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
            count++; // increment count if previous char = ' ' and current char != ' '
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = in.nextLine();
        System.out.println(wordCount(s) + " words.");
        in.close();
    }
}