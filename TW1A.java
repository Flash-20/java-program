package tw1a;
import java.util.Scanner;
public class TW1A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int [5][3];
        int i, j, total=0, average=0, min;
        for(i=0; i<5; i++)
        {
            System.out.println("Enter the marks of student" +(i+1)+ ";");
            for(j=0; j<3; j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        for(i=0; i<5; i++)      //total marks
        {
            for(j=0; j<3; j++)
            {
                total = total + a[i][j];
            }        
            if(a[i][0]<a[i][1])     //finding min term
            {
                if(a[i][0]<a[i][2])
                {
                    min = a[i][0];
                }
                else
                {
                    min = a[i][2];
                }
            }
            else if(a[i][1]<a[i][2])
            {
                min = a[i][1];
            }
            else
            {
                min = a[i][2];
            }
            average = (a[i][0] + a[i][1] + a[i][2] - min)/2;
            System.out.println("Total marks of " +(i+1)+ "student:" + total);
            System.out.println("Average marks of " +(i+1)+ "student:" + average);
            
        total=0;
        average=0;
        }
        
        }
}
    