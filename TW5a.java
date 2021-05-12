package tw5a;
import java.util.Scanner;

class Stack
{
    int elem[], top;
    
    void initStack(int size)
    {
        elem = new int[size];
        top = -1;
    }
    
    void initStack(Stack another)
    {
        elem = another.elem;
        top = another.top;
    }
    
    void initStack(int[]a)
    {
        top = a.length-1;
        elem = new int[a.length+10];
        for(int i=top; i>=0; i--)
        {
            elem[i] = a[i];
        }
    }
    
    void push(int x)    
    {
        if(top == elem.length-1)
        {
            System.out.println("stack is full");
        }
        else
        {
            elem[++top] = x;
        }
    }
    
    int pop()    
    {
        if(top<0)
        {
            System.out.println("stack empty");
            return -1;
        }
        else
        {
            return elem[top--];
        }
    }
    
    int peek()    
    {
        return 1;
    }
    
    public void disp()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(" "+elem[i]);
        }
    }
}
public class TW5a {


    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.initStack(10);
        System.out.println("element pushed into the stack is : 12");
        s1.push(12);
        System.out.println("element pushed into the stack is : 12");
        s1.push(12);
        System.out.println("element pushed into the stack is : 29");
        s1.push(29);
        System.out.println("element pushed into the stack is : 15");
        s1.push(15);
        System.out.println("Displaying elements present in Stack 1");
        s1.disp();
        
        
        Stack s2=new Stack();
        s2.initStack(s1);
        System.out.println("Displaying elements present in Stack 2");
        s2.disp();
        
        

        Stack s3=new Stack();
        s3.initStack(5);
        System.out.println("Displaying elements present in Stack 3");
        s3.disp();
        s1.push(7);
        System.out.println("first stack");
        s1.disp();
        System.out.println("element pushed into the stack is : 88");
        s2.push(88);
        System.out.println("second stack");
        s2.disp();
        System.out.println("element pushed into the stack is : 100");
        s3.push(100);
        System.out.println("third stack");
        System.out.println("Displaying elements present in Stack 3");
        s3.disp();
        System.out.println("element is poped from Stack 3");
        s3.pop();
        s3.push(10);
        s3.push(20);
        s3.push(30);
        s3.push(40);
        s3.push(50);
        s3.push(60);
        s3.push(70);
        s3.push(80);
        s3.push(90);
        System.out.println("Displaying elements present in Stack 3 after poping the top element:");
        s3.disp();
    }
}
