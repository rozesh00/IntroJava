package Chapter2.sub1;

public class Motorcycle extends Vehicle{

    int make;
    String model;
    int year;

    public Motorcycle(int make, String model, int year){
        super(year);
        this.make = make;
        this.year = year;
        this.model= model;
    }

    public double price(){
        return 1.0;
    }
}
