package tw2a;
import java.util.Scanner;

class Rectangle{
    int length, breadth, area;
    void setDim(int l, int b)
    {
        length = l;
        breadth = b; 
    }
    void getArea()
    {
        area = length * breadth;
        System.out.println("Area of rectangle:" + area);
    }
}
public class TW2A {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter the length and breadth:");
        int l = in.nextInt();
        int b = in.nextInt();
        r.setDim(l, b);
        r.getArea();
    }
    
}
