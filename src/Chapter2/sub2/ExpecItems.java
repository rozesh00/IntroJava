package Chapter2.sub2;

import java.util.Date;

public class ExpecItems {

    //member variables
    private String name;
    private Date  dateTime;

    //Constructor
    public ExpecItems(String name){
        this.name= name;
        this.dateTime = new Date();//initializing dateTime by creating new object of Date class
    }

    //getter methods for name and date to access the private variables
    public String getName(){
        return name;
    }

    public Date getDateTime(){
        return dateTime;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Created at:  " + dateTime;
    }
}
