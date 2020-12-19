import java.util.Scanner;
public class CarManufacturers
{ 
    public static void main(String[] args)  
    { 
        Scanner in=new Scanner(System.in); 
        int [][] cars=new int[6][12]; 
        int i,j,total; 
        for(i=0;i<6;i++) 
        { 
            System.out.println("Enter the no of sales by car manufacturer "+i+" in 12 months respectively: "); 
            for(j=0;j<12;j++) 
            { 
                cars[i][j]=in.nextInt(); 
            } 
            maxSales(cars,i); 
            total= maxSales(cars, i); // Here i am passing index of i which represents individual car manufacturer
            avgSales(total);
            System.out.println(); 
        }// end of for loop 
    }
    static int maxSales(int cars[][], int i) 
    { 
        int j,max,temp=0; 
        max=0; 
        for(j=0;j<12;j++) 
        { 
            if(cars[i][j]>max) 
            { 
                max=cars[i][j]; 
                temp=j; // in temp I will store the value of j which represents month 
            } 
        } 
        System.out.println("Maximum number of cars sold are "+max+" in the month "+(temp+1)); // (temp+1) because index starts from zero 
        return temp;
    }
    static int TotalSales(int cars[][],int i) 
    { 
        int j,total=0; 
        for(j=0;j<12;j++) 
        { 
            total=total+cars[i][j]; 
        } 
        System.out.println("Total sales by car manufacturer are "+total); 
        return total; 
    }     
    static void avgSales(int total) 
    { 
        int avg; // Since no of car sales cannot be a floating point number,let us connsider it as int 
        avg=total/12; 
        System.out.println("Average sales by car manufacturer are "+avg); 
    }    
}