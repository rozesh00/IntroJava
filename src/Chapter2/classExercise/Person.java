package Chapter2.classExercise;

public class Person {

    public String name;
    public String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString(){
        return this.name + ", "+ this.address;
    }
}
