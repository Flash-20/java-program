import java.util.Scanner;
class Rectangle 
{ 
    int length,breadth;
    void setDim(int a,int b)  // gets length and breadth of rectangle
    { 
        length=a; breadth=b; 
    }
    double getArea()   // finds area of rectangle
    {
        return(length*breadth);
    }
    public static void main(String[] args)
    {    
        Rectangle r=new Rectangle();  // creates an object of class rectangle
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        int a=in.nextInt();
        int b=in.nextInt();
        r.setDim(a, b);  // setting dimensions of rectangle
        System.out.println("Area of rectangle is "+r.getArea());  // displaying area of rectangle
        in.close();
    }
}
