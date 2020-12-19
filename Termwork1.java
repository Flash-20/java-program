//Demonstration of 2D array!!
import java.util.Scanner;
public class Termwork1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int [][]marks=new int[5][3]; /*Declaration of 2-D array */
        int total,i,j;
        float avg;
        System.out.println("Details of Five Students are:");
        for(i=0;i<5;i++)
        {
            total=0; /*Total and Average are assigned to 0 after each pass because this prevents the addition of data of previous student*/
            avg=0;
            System.out.println("Enter three subject's marks of student "+(i+1)+":");
            for(j=0;j<3;j++)
            {
                marks[i][j]=in.nextInt();
                total=total+marks[i][j];
                if(marks[i][0]>marks[i][1])
                {
                    if(marks[i][1]>marks[i][2])
                        avg=(float)((marks[i][0]+ marks[i][1])/2f);
                    else 
                        avg=(float)((marks[i][0]+marks[i][2])/2f); 
                } 
                    else if(marks[i][0]>marks[i][2]) 
                        avg=(float)((marks[i][0]+marks[i][1])/2f); 
                    else 
                        avg=(float)((marks[i][1]+marks[i][2])/2f); 
            }// End of j loop 
            System.out.println("Total marks of Student "+(i+1)+" are : "+total); 
            System.out.println("average marks of student "+(i+1)+" are : "+avg); 
            System.out.println(); 
        }//End of i loop 
    }   
} 
    