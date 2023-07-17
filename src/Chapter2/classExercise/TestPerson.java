package Chapter2.classExercise;

import java.util.ArrayList;
import java.util.Objects;

public class TestPerson {
    public static void main(String[] args) {
//If a reference to a Student type object is stored in a Person type variable, only the methods
// defined in the Person class (and its superclass and interfaces) are available:

        /*
        Person ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
ollie.credits();        // DOESN'T WORK!
ollie.study();              // DOESN'T WORK!
System.out.println(ollie);   // ollie.toString() WORKS
         */
        Person ada = new Person("Ada", "St. London");
        Person esko = new Person("Esko", "Broadway ava");
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "Hollywood LA");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits() );
        ollie.study();
        // System.out.println("Study credits: " + ollie.credits()); //operator + cannot
        // be applied to void + string
        System.out.println("Study credits " + ollie.credits() );
        System.out.println(ollie);

        Teacher rubi = new Teacher("Rubi", "311 princeton", 3000);
        System.out.println(rubi);

        ArrayList<Person> arrPerson = new ArrayList<>();
        arrPerson.add(ada);
        arrPerson.add(ollie);
        arrPerson.add(rubi);
        System.out.println(arrPerson + "\n");

        Person oliPerson = new Student("Ollie", "norway st.");
        System.out.println(oliPerson);
        Object oliObject = new Student("Olie", "Norway st.");
        System.out.println(oliObject);

/*
Which version of the toString method will be executed: the one defined in Object, Person, or Student?
The method to be executed is chosen based on the actual type of the object, which means the class
whose constructor is called when the object is created.(i.e. Student object is created) If the method
has no definition in that class, the version of the method is chosen from the class that is closest to the actual type in the inheritance hierarchy.
 */

    }
}
