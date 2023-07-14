package Chapter2;

public class TestShapes {

    public static void main(String[] args) {

        double l1=10.0;
        double b1 = 2.0;


        Shape newShape = new Shape();
        Rectangle newRectangle = new Rectangle(l1, b1);

        newShape.getArea();
        double outpt = newRectangle.getArea();
        System.out.println("The area of rectangle with length "+ l1 + " and breadth "+ b1 + " is "+ outpt);


    }
}
