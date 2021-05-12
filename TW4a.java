package tw4a;
import java.util.Scanner;

class Employee{
    String name;
    int age;
    String address;
    double salary;
    String gender;
    
    Employee(String name, int age, String address, double salary, String gender)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
    }
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name, int age, String address, double salary, String gender)
    {
        super(name, age, address, salary, gender);
    }
    void showDeatils()
    {
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Address:" +address);
        System.out.println("Salary:" +salary);
        System.out.println("Gender:" +gender);
    }
    double computeDearnessAllowance()
    {
        double dearnessAllowance;
        dearnessAllowance = this.salary * 0.75;
        return(dearnessAllowance);
    }
    double computeHRA()
    {
        double HRA;
        HRA = this.salary * 0.075;
        return(HRA);
    }
    double computeIT()
    {
        double IT;
        IT = this.salary * 0.01;
        return(IT);
    }
    void computeGrossSalary()
    {
        double GrossSalary;
        GrossSalary = this.computeDearnessAllowance() + this.computeHRA() + this.computeIT();
        System.out.println("Total Gross salary:" + GrossSalary);
    }
}
class PartTimeEmployee extends Employee{
    String qualification;
    int experience, noofhours;
    PartTimeEmployee(String name, int age, String address, String gender, String qualification, int experience, int noofhours)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.qualification = qualification;
        this.experience = experience;
        this.noofhours = noofhours;
    }
    void showDeatils()
    {
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Address:" +address);    
        System.out.println("Gender:" +gender);
        System.out.println("Qualifiaction:" +qualification);
        System.out.println("Experience:" +experience);
        System.out.println("No of hours:" +noofhours);
    }
    void computeSalary()
    {
        if(experience >=1 && experience <=5)
        {
            if(qualification.equalsIgnoreCase("BE"))
            {
                salary = 300;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }
            if(qualification.equalsIgnoreCase("MTECH"))
            {
                salary = 500;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }
            if(qualification.equalsIgnoreCase("PHD"))
            {
                salary = 800;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }       
        }
        if(experience >=5 && experience <=10)
        {
            if(qualification.equalsIgnoreCase("BE"))
            {
                salary = 400;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }
            if(qualification.equalsIgnoreCase("MTECH"))
            {
                salary = 700;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }
            if(qualification.equalsIgnoreCase("PHD"))
            {
                salary = 1200;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }
        }
        if(experience >=10)
        {
            if(qualification.equalsIgnoreCase("BE"))
            {
                salary = 500;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }
            if(qualification.equalsIgnoreCase("MTECH"))
            {
                salary = 1000;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }
            if(qualification.equalsIgnoreCase("PHD"))
            {
                salary = 1500;
                System.out.println("Salary per hour:" + salary);
                System.out.println("Salary is:" + salary*noofhours);
            }
        }
    }
}


    
    
    

public class TW4a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press F for fulltime employee and P for parttime employee:");
        String choice = in.next();
        if(choice.equalsIgnoreCase("F"))
        {
            System.out.println("Enter details of full time employee:");
            System.out.println("Enter name:");
            String name = in.next();
            System.out.println("Enter age:");
            int age = in.nextInt();
            System.out.println("Enter address:");
            String address = in.next();
            System.out.println("Enter salary:");
            double salary = in.nextDouble();
            System.out.println("Enter gender:");
            String gender = in.next();
            FullTimeEmployee F = new FullTimeEmployee(name, age, address, salary, gender);
            F.computeGrossSalary();
            F.showDeatils();
        }
        if(choice.equalsIgnoreCase("P"))
        {
            System.out.println("Enter details of part time employee:");
            System.out.println("Enter name:");
            String name = in.next();
            System.out.println("Enter age:");
            int age = in.nextInt();
            System.out.println("Enter address:");
            String address = in.next();
            System.out.println("Enter gender:");
            String gender = in.next();
            System.out.println("Enter qualification:");
            String qualification = in.next();
            System.out.println("Enter experience:");
            int experience = in.nextInt();
            System.out.println("Enter noofhours:");
            int noofhours = in.nextInt();
            PartTimeEmployee P = new PartTimeEmployee(name, age, address, gender,qualification, experience, noofhours);
            P.computeSalary();
            P.showDeatils();
        }
    }
}