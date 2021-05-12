package tw6a;

abstract class Class
{
    String carName;
    int chassiNum;
    String modelName;
    
    public Car(String carName, int chassiNum, String modelName)
    {
        this.carName = carName;
        this.chassiNum = chassiNum;
        this.modelName = modelName;
    }
    public void startCar()
    {
        System.out.println("the car has started");
    };

    abstract public void operateSterring();
}


class MarutiCar extends Car implements A
{
    int mileage ;
    String enginenum;
        
    public MarutiCar(String carName, int chassiNum, String modelName, int mileage, String enginenum)
    {
        super(carName, chassiNum, modelName);
        this.mileage = mileage;
        this.enginenum = enginenum;
    }
    public void startCar()
    {
        System.out.println("Starting the car with Electronic ignition");
    }
    public void operateSterring()
    {
        System.out.println("turning left and right as needed\n");
    }
    @Override
    public void disp()
    {
        
    }
}


class BMWcar extends Car 
{
    float emissionlevel;
    int numAirbag;
    
    public BMWcar(String carname, int chassinum, String modelname, float emissionlevel, int numAirbag)
    {
        super(carname, chassinum, modelname);
        this.emissionlevel = emissionlevel;
        this.numAirbag = numAirbag;
    }
    public void startaCar()
    {
        System.out.println("starting the car with a remote and Peizoelectric effect");
    }
    public void operateSterring()
    {
        System.out.println("BMW turning left and right and is easy to operate since it is power stering");
    } 
}


class Driver 
{
    String drivername;
    int age;
    char gender;
    
    public Driver(String drivername, int age, char gender)
    {
        super();
        this.drivername = drivername;
        this.age = age;
        this.gender = gender;
    }
    public void drivercar(Car c)
    {
        System.out.println("Driver name is " + this.drivername + " and is driving " + c.carName);
        c.startCar();
        c.operateSterring();
    }
}

public class TW6a {

    
    public static void main(String[] args) {
        MarutiCar m = new MarutiCar("Zen", 11223, "2002 model",18,"EN4333");
        BMWcar b = new BMWcar("BMW AS - 8",3322, "2010 model",12.32f ,4);
        Driver d = new Driver("vivek",19,'M');
        Car c;
        c=m;
        d.drivercar(c);
        c=b;
        d.drivercar(c);
    }
}
