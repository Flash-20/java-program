package tw8a;
import java.util.Scanner;

class License
{
    String name;
    int no_of_cases, age;
    char valid_LL, gender;
    
    License()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Name:");
        name = in.nextLine();
        System.out.println("Age:");
        age = Integer.parseInt(in.nextLine());
        System.out.println("Gender:");
        gender = in.next().charAt(0);
        System.out.println("Is valid LL issued(Y/N)?");
        valid_LL = in.next().charAt(0);
        System.out.println("Number of accidents in past ?");
        no_of_cases = in.nextInt();
    }
    
    void validateData()
    {
        try
        {
            if(age<18)
                throw new UnderAgeException("Invalid age");
            if(valid_LL != 'Y')
                throw new InvalidLLException("Invalid LL");
            if(no_of_cases > 0)
                throw new AccidentException("Involved in accidents");
        }
        catch(UnderAgeException | InvalidLLException | AccidentException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}

class UnderAgeException extends Exception
{
    UnderAgeException(String msg)
    {
        super(msg);
    }
    @Override
    public String toString()
    {
        return "Person is underage";
    }
}
class InvalidLLException extends Exception
{
    InvalidLLException(String msg)
    {
        super(msg);
    }
    @Override
    public String toString()
    {
        return "Person hasn't issued for the LLR yet";
    }
}
class AccidentException extends Exception
{
    AccidentException(String msg)
    {
        super(msg);
    }
    @Override
    public String toString()
    {
        return "Person has many accidents case on him";
    }
}

public class TW8a {

    public static void main(String[] args) {
        License l = new License();
        l.validateData();
    }
}
