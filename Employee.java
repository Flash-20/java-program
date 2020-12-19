abstract class Employee {
    String name;
    int age;
    String address;
    char gender;
    double salary;
    Employee(String name, int age, String address, char gender){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }
    void showDetails() {
        System.out.println();
    }
    abstract void computeSalary();
}
class FTEmployee extends Employee{
    FTEmployee(String name, int age, String address, char gender) {
        super(name, age, address, gender);
        
    }

    double basic;
    
    void FTEmpolyee(String name, int age, String address, char gender, double basic) {
        
    }

    @Override
    void computeSalary() {

    }
}