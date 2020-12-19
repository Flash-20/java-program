import java.util.Scanner;
public class interactive
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        int sum = 0, n = 0;
        do
        {
            System.out.print("Enter an interger: ");
            int t = in.nextInt();
            sum += t;
            n++;
            System.out.printf("Sum = %d.\n", sum);
            System.out.print("\nDo you wish to continue? (Y/N): ");
            char c = in.next().charAt(0);
            if (c == 'n' || c == 'N')
            {  //go on and on till user says n final or N and final display average after final user quits;
                System.out.printf("Average = %d.\n", sum / n);
                cont = false;
            }
        } while (cont);
        in.close();
    }
}