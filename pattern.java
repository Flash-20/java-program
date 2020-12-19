import java.util.Scanner;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of lines: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<i; j++)
                System.out.printf("%d",i);   //printing numbers
            System.out.println();
        }
        in.close();
    }
}