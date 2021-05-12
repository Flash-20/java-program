package tw4b;
import java.util.Scanner;

class Circle{
    double radius=1.0;
    String color="red";
    Circle(){       //parameterless constructor
        
    }
    Circle(double radius)
    {
        this.radius =radius;
    }
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    double getRadius(double radius){
        return(this.radius);
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    String getColor() // to get the color of circle
    {
        return(this.color);
    }
    void getColor(String color) // to initialise the color of radius again
    {
        this.color=color;
    }
    double getArea(){
        return(Math.PI*this.radius*this.radius);
    }
}

class Cylinder extends Circle{
    double height = 1.0;
    
    Cylinder(){
        
    }
    Cylinder(double height) // parameterised constructor with height as parameter
    {
        this.height=height;
    }
    Cylinder(double height , double radius) //parameterised constructor with height and radius as parameter
    {
        super(radius); // calling super constructor i.e. Circle()
        this.height=height;
    }
    Cylinder(double height, double radius ,String color) // parameterised constructor with height , radius and color as parameter
    {
        super(radius,color);
        this.height=height;
    }
    double getHeight() // to get the height
    {
    return(this.height);
    }
    void setHeight(double height) // to initialise the height again
    {
    this.height=height;
    }
    double getVolume() // function to compute volume
    {
        return(this.getArea()*height);
    }

}
public class TW4b {

    public static void main(String[] args) {
        double radius, height;
        String color;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of cylinder:");
        radius = in.nextDouble();
        System.out.println("Enter height of cylinder:");
        height = in.nextDouble();
        Cylinder c = new Cylinder();  //calling constructor//
        c.setHeight(height);
        c.setRadius(radius);
        System.out.println("Radius of cylinder is :" + c.radius);
        System.out.println("Height of cylinder is:" + c.height);
        System.out.println("Color of cylinder is:" + c.color);
        System.out.println("Area of base of cylinder:" + c.getArea());
        System.out.println("VOlume of cylinder:" + c.getVolume());

        System.out.println("\nwhen radius is changed"); 
        System.out.println("Enter the radius of Cylinder again");
        radius=in.nextDouble();
        c.setRadius(radius);
        System.out.println("new radius of Cylinder is : " + c.radius);
        System.out.println("new Area of base of Cylinder is :" + c.getArea());
        System.out.println("new Volume of Cylinder is : " + c.getVolume());

        System.out.println("\nwhen height is changed"); 
        System.out.println("Enter the height of Cylinder again");
        height=in.nextDouble();
        c.setHeight(height);
        System.out.println("new height of Cylinder is : " + c.height);
        System.out.println("new Area of base of Cylinder is :" + c.getArea());
        System.out.println("new Volume of Cylinder is : " + c.getVolume());
        
        System.out.println("\nwhen color is changed"); 
        System.out.println("Enter the color of Cylinder again");
        color=in.next();
        c.getColor(color);
        System.out.println("new color of Cylinder is : " + c.color);
       }
}
