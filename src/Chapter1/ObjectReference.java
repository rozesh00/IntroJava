package Chapter1;

public class ObjectReference {


    public static void main(String[] args) {

        //to access the information in Person class create an object
        //personName, can hold a reference to an object of the Person class.
        //The new keyword is used to create a new instance of the Person class.
        // This instance is an object of the Car class and will reside in memory.
        //The newly created Car object is assigned to the variable ca. Now, ca holds a reference
        // to the memory location where the Car object is stored.

        Person personName = new Person(); //this creates a new memory @123, where John is stored
        TestMethods testMeth = new TestMethods();
        System.out.println(personName.name);
        System.out.println("Address for personName" + personName);
        testMeth.method1(personName);
        System.out.println(personName.name);



    }
}
