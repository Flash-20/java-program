import java.util.Scanner;
import java.lang.Math;
class Circle
{
    int radius;
    void getRadius(int a)   // getting radius 
    {   
        radius=a;
    } 
    void computeArea() // function to compute area of circle
    {
        System.out.println("Area is "+(Math.PI*radius*radius));
    }
    void computePerimeter()  // function to compute perimeter of circle
    {
        System.out.println("Perimeter is "+(2*Math.PI*radius));
    }
    public static void main(String[] args) 
    {
        Circle c=new Circle();  // creating an object of class Circle
  	    Scanner in=new Scanner(System.in);
  	    System.out.println("Enter radius of Circle");
  	    int a=in.nextInt();
  	    c.getRadius(a);   // setting radius of circle
  	    c.computeArea();   // calling computeArea function
        c.computePerimeter();  // calling compute perimeter function
        in.close();
    }
}