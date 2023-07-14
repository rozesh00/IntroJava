package Chapter2.sub1;

public class Truck extends Vehicle{

    int make;
    String model;
    int year;

    public Truck(int make, String model, int year){
        super(year); //calling the Vehicle class constructor, important, otherwise error!!
        this.make = make;
        this.year = year;
        this.model= model;
    }

    @Override
    public double maxSpeed() {
        System.out.println("THE max speed of truck is ");
        return year/2.0;
    }

    public  int numWheels(){
        return 8;
    }
}
