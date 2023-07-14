package Chapter2.sub1;

public class Vehicle {
    int year;

    public Vehicle(int year){
        this.year= year;
    }

    public double maxSpeed(){

        return 1.0;
    }

    public boolean approve(){
        if(year< 2000){
            return false;
        }return true;
    }




}
