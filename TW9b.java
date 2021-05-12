package tw9b;
import java.util.Scanner;
import java.util.Arrays;

public class TW9b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String s1 = in.next();
        System.out.println("Enter 2nd string:");
        String s2 = in.next();
        
        checkAnagram(s1, s2);
    }
    static void checkAnagram(String s1, String s2)
    {
        char []c1 = s1.toCharArray();
        char []c2 = s2.toCharArray();
        if(c1.length != c2.length)
        {
            System.out.println(s1 + " and " + s2 + " are not Anagrams.");
        }
        else
        {
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1, c2))
            {
                System.out.println(s1 + " and " + s2 + " are Anagrams");
            }
            else
            {
                System.out.println(s1 + " and " + s2 + " are not Anagrams");
            }
        }
    }  
}
