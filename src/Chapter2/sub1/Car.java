package Chapter2.sub1;

import javax.sound.midi.Soundbank;

public class Car {
    int make;
    String model;
    int year;

    public Car(int make, String model, int year){
        this.make = make;
        this.year = year;
        this.model= model;
    }

    public boolean approve(){
        if (this.year<2000){
            System.out.println("Sorry vehicle cannot be approved");
            return false;
        }return true;
    }


}
