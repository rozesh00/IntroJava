package Chapter2;

public class Rectangle extends Shape {

    double length;
    double breadth;

    public Rectangle(double len, double breadt){
        this.length = len;
        this.breadth = breadt;
    }



    @Override
    public double getArea() {
        //super.getArea(); //calls the makeSound()
        return length*breadth;
    }
}
