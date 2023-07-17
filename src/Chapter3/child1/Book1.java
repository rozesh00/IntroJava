package Chapter3.child1;

public class Book1 {
    private String title;
    private int pages;
    private int year;


    public Book1(String title, int pages, int year   ){
        this.title =title;
        this.pages= pages;
        this.year= year;

    }

    public String getTitle(){
        return title;

    }
    public int getPages(){
        return pages;

    }
    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + pages+ ", " + year;
    }
}
