package Chapter2.sub1;

public class TestVehicle {
    public static void main(String[] args) {

        Truck newTruck = new Truck(2021, "Toyota", 3000);
        boolean ans= newTruck.approve();
        System.out.println("Is the truck approved for production? " + ans );






    }
}
