package tw3a;
import java.util.Scanner;

class myBankAccount {
    Scanner in = new Scanner(System.in);
    double accNo; 
    String accType;
    String name;
    String address;
    double accBalance;
    double amount;
    myBankAccount()
    {
        
    }
    myBankAccount(double accNo, String accType, String name, String address, double accBalance)
    {
        this.accNo = accNo;
        this.accType = accType;
        this.name = name;
        this.address = address;
        this.accBalance = accBalance;
    }
    void computeInterest()
    {
        if(this.accType.equalsIgnoreCase("SB"))
            this.accBalance = this.accBalance*0.05;
        else if(this.accType.equalsIgnoreCase("RD"))
            this.accBalance = this.accBalance*0.065;
        else
            this.accBalance = this.accBalance*0.0765;
    }
    void withdrawAmount()
    {
        System.out.println("Do you want to withdraw amount in ? Yes or No");
        String choice = in.next();
                if(choice.equalsIgnoreCase("Yes")){
                    System.out.println("Enter the amount to withdraw:");
                    amount = in.nextDouble();
                    if(this.accBalance > amount +1000)
                    {
                    this.accBalance -= amount;
                    System.out.println("Withdraw successfull");
                    }
                }
                else
                {
                    System.out.println("Withdraw unsuccessfull");
                }
            amount = 0;
    }
    void depositAmount()
    {
        System.out.println("Do you want to deposit amount ? Yes or No");
        String choice = in.next();
                if(choice.equalsIgnoreCase("Yes"))
                {
                    System.out.println("Enter the amount to deposit:");
                    amount = in.nextDouble();
                    this.accBalance += amount;
                    amount = 0;
                }
                else
                    System.out.println("Deposit unsuccessfull");
    }
    void display()
    {
        System.out.println("\t"+this.accNo + "\t"+this.accType + "\t"+this.name + "\t"+this.address + "\t"+this.accBalance);
    }
}
public class TW3a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        myBankAccount []a = new myBankAccount[3];
        for(int i=0; i<3; i++)
        {
            System.out.println("Enter the details of " +(i+1)+ " person:");
            System.out.println("Enter account number:");
            double accNo = in.nextDouble();
            System.out.println("Enter account type:");
            String accType = in.next();
            System.out.println("Enter name:");
            String name = in.next();
            System.out.println("Enter address:");
            String address = in.next();
            System.out.println("Enter account balance:");
            double accBalance = in.nextDouble();
            a[i] = new myBankAccount(accNo, accType, name, address, accBalance);
            a[i].computeInterest();
            
        }
        for(int i=0; i<3; i++)
        {
            System.out.println("For " +(i+1)+" person:");
            a[i].depositAmount();
            a[i].withdrawAmount();
        }
        for(int i=0; i<3; i++)
        {
            a[i].display();
        }
    }
}
 