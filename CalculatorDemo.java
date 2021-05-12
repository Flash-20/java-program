package calculatordemo;

class Calculator{
    double a, b ,div=0;
    double add(double a, double b)
    {
        return(a+b);
    }
    double sub(double a, double b)
    {
        return(a-b);
    }
    double mul(double a, double b)
    {
        return(a*b);
    }
    void div(double a, double b)
    {
        if(b==0)
            System.out.println("Error.Divide by zero");
        else
            div = a/b;
            System.out.println("Division result:" + div);
    }
}
public class CalculatorDemo {


    public static void main(String[] args) {
        Calculator c = new Calculator();
        double x=12.0f, y=14.5f;
        System.out.println("Sum:" + c.add(x,y));
        System.out.println("Subtraction:" + c.sub(x,y));
        System.out.println("Multiplication:" + c.mul(x,y));
        c.div(x,y);
    }
    
}
