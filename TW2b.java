package tw2b;
import java.util.Scanner;
import java.lang.Math;
class Triangle{
    double s1, s2, s3;
    double area;
    void getSides(double a, double b, double c){
        s1 = a;
        s2 = b;
        s3 = c;
    }
    void checkTypes(double a, double b, double c){
        if(a==b && b==c && a==c)
            System.out.println("It is an equilateral triangle");
        else if(a==b || b==c || a==c)
            System.out.println("It is an isocelous triangle");
        else
            System.out.println("It is a scalene triangle");
    }
    void computeArea(double a, double b, double c){
        
        double s = (a+b+c)/2;
        area = (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.println("Area of the triangle is:" + area);
    }
}
public class TW2b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangle t = new Triangle();
        System.out.println("Enter the sides of the triangle:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        t.getSides(a, b, c);
        t.checkTypes(a, b, c);
        t.computeArea(a, b, c);
    }
    
}
