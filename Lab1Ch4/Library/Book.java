package Library;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private Author bookAuthor;
    private String title;
    /**
     * Constructor for objects of class Book
     */
    public Book(Author a, String titl)
    {
        // initialise instance variables
        this.bookAuthor = a;
        this.title = titl;
    }
    public String toString(){
        return "the book title is " + this.title + bookAuthor;
    }
}
