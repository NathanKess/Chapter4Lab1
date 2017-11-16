package Library;


/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    private Book[] books;
    
    /**
     * Constructor for objects of class Library
     */
    public Library(int size, String nm)
    {
        // initialise instance variables
        this.books = new Book[size];
        this.name = nm;
    }
    public String toString(){
        String output = "the Library has th fallowing" + this.name + " Has the fallowing \n";
        for(Book b : books){
            output += b + "\n";
        }
        return output;
    }
    public void addBook(int location, Book b){
        books[location] = b;
    }
}
