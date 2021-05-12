package tw9a;
import java.util.Scanner;

public class TW9a {


    public static void main(String[] args) {
        String inputline;
        String []allWords;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        inputline = in.next();
        allWords = inputline.split(" ");
        for(String s : allWords)
        {
            if(isPalindrome(s, 0, s.length()-1))
            {
                System.out.println(s.toUpperCase());
                System.out.println("It is a Palindrome");
            }
            else
            {
                System.out.println(reverseString(s).toLowerCase());
                System.out.println("Its is not Palindrome");
            }
        }
    }
    public static boolean isPalindrome(String myWord, int s, int t)
    {
        if(myWord.charAt(s) == myWord.charAt(t))
        {
            if(s<t)
                return isPalindrome(myWord, s+1, t-1);
            else
            {
                if(s==t)
                    return true;
            }
        }
        return false;
    }
    public static String reverseString(String s)
    {
        String rS = "";
        for(int i=s.length()-1; i>=0; i--)
        {
            rS = rS+s.charAt(i);
        }
        return rS;
    }
}
