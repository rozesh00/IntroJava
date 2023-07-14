package Chapter1;

public class TestMethods {

    public void method1( Person newP){
        newP = new Person(); //this creates a new memory. @456 where Jenny is stored, initially
        //newP pointed to @123 but because of new Person(), it will point to the @456
        System.out.println("Address for newP"+newP);
        newP.name= "Jenny";
        method2(newP);


    }

    public void method2(Person asinPerson){
        asinPerson.name ="Bulbul"; //this will change Jenny to Bulbul

    }
}
