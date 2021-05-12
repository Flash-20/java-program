package tw5c;

class Rectangle 
{
    double length, breadth;
    Rectangle(double length, double breadth)
    {
        this.length = length;
        this. breadth = breadth;
    }
    double computeArea()
    {
        return(length*breadth);
    }
    double computePerimeter()
    {
        return(2*length+breadth);
    }
}

class Cuboid extends Rectangle
{
    double height;
    Cuboid(double length, double breadth, double height)
    {
        super(length, breadth);
        this.height = height;
    }
    @Override
    double computeArea()
    {
        return(2*((length*breadth)+(height*length)+(height*breadth)));
    }
    @Override
    double computePerimeter()
    {
        return(2*length+breadth);
    }
    double computeVolume()
    {
        return(length*breadth*height);
    }
    
}

public class TW5c {

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5,6);
        System.out.println("Area of Rectangle : " + r1.computeArea());
        System.out.println("Perimeter of Rectangle : " + r1.computePerimeter());
        Cuboid c1=new Cuboid(1,2,3);
        System.out.println("Area of Cuboid : " + c1.computeArea());
        System.out.println("Perimeter of Cuboid : " + c1.computePerimeter());
        System.out.println("Volume of Cuboid : " + c1.computeVolume());
    }
    
}
