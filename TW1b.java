package tw1b;
import java.util.Scanner;
public class TW1b {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a[][] = new double [4][10];
        int i, j;
        double maxsales, avgsales, poorlysales;
        for(i=0; i<4; i++)
        {
            System.out.println("Enter the total sales by " +(i+1)+ "company:");
            for(j=0; j<10; j++)
            {
                a[i][j] = in.nextDouble();
            }
        }
    }
    
}
