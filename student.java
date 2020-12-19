import java.util.Scanner;
public class student
{
    int m1, m2, m3;
    float average;
    int total = 0;
    void computeAverage()
    {
        int min;
        min = (m1 < m2) ? m1 : m2;
        min = (min < m3) ? min : m3;
        average = (float) ((m1 + m2 + m3 - min) / 2.0);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Input number of students: ");
        int n = in.nextInt();
        student[] arr = new student[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Input marks scored in 3 subjects for student %d: ", i + 1); 
            arr[i].m1 = in.nextInt();
            arr[i].m2 = in.nextInt();
            arr[i].m3 = in.nextInt();
            arr[i].computeAverage(); //compute average for every object that is created 
            arr[i].total += arr[i].m1 + arr[i].m2 + arr[i].m3; 
        } 
        System.out.println(); 
        for (int i = 0; i < n; i++) 
            System.out.printf("Average of student %d: %f\nTotal of student %d: %d\n", i + 1, arr[i].average, i + 1, arr[i].total);
        in.close();
    } 
}