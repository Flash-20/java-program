package tw7b;

interface IAnimal
{
    abstract void walk();
    abstract void sleep();
}

interface IBird
{
    abstract void fly();
    abstract void peek();
}

interface IHuman
{
    abstract void eat();
    abstract void speak();
}

class Bird implements IAnimal, IBird
{
    @Override
    public void walk()
    {
        System.out.println("BIRD IS WALKING");
    }
    @Override
    public void sleep()
    {
        System.out.println("BIRD IS SLEEPING");
    }
    @Override
    public void fly()
    {
        System.out.println("BIRD IS FLYING");
    }
    @Override
    public void peek()
    {
        System.out.println("BIRD IS PEEKING");
    }
}

class Human implements IAnimal, IHuman
{
    @Override
    public void walk()
    {
        System.out.println("BIRD IS WALKING");
    }
    @Override
    public void sleep()
    {
        System.out.println("BIRD IS SLEEPING");
    }
    @Override
    public void eat()
    {
        System.out.println("BIRD IS EATING");
    }
    @Override
    public void speak()
    {
        System.out.println("BIRD IS SPEAKING");
    }
}

public class TW7b {


    public static void main(String[] args) {
        Bird b = new Bird();
        Human h = new Human();
        System.out.println("INVOKING METHODS OF BIRD CLASS>>");
        b.walk();
        b.sleep();
        b.fly();
        b.peek();

        System.out.println("INVOKING METHODS OF HUMAN CLASS>>");
        h.walk();
        h.sleep();
        h.eat();
        h.speak();
    }
    
}
