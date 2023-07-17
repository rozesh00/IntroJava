package Chapter2.classExercise;

public class Student extends Person{
    int credit;

    public Student(String name, String address){
        super( name,  address);
        this.credit =0;
    }

    public int credits(){
        return this.credit;
    }
    public void study(){
        credit++;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.address + ", " + " Study credit: " + this.credit;
    }
}
