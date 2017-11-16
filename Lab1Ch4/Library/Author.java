package Library;


/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    private String name;
    private int age;
    /**
     * Constructor for objects of class Author
     */
    public Author(String nam,int aAge)
    {
        // initialise instance variables
        this.name = nam;
        this.age = aAge;
    }
    public String toString(){
        return this.name;
    }
}
