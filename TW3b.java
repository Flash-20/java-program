package tw3b;
import java.util.Scanner;

class Rectangle{
    int length, breadth, area;
    Rectangle()
    {
        
    }
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    void computeArea(int length, int breadth)
    {
        area = length * breadth;
        System.out.println("Area of Rectangle :" + area);
    }
}
public class TW3b {
    
    public static void main(String[] args) {
        int length, breadth;
        Scanner in = new Scanner (System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter length and breadth:");
        length = in.nextInt();
        breadth = in.nextInt();
        r.computeArea(length, breadth);
    }
    
}
