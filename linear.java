import java.util.Scanner;
public class linear
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number of elements: ");
        int n = in.nextInt();
        int array[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int c = 0; c < n; c++)
            array[c] = in.nextInt();
        System.out.printf("Enter value to find: ");
        int search = in.nextInt();
        int c;
        in.close();
        for (c = 0; c < n; c++)
            if (array[c] == search) /* Searching element is present */
            {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        if (c == n) /* Element to search isn't present */
            System.out.println(search + " isn't present in the array.");
    }
}