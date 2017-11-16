package Library;


/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args){
        //Crate THIS SHIT!!
        Library ahs = new Library(10, "Acalanes");
        Author WEEWEE = new Author("FUCK YOU", 1000000);
        Book b = new Book(WEEWEE, "POO POO PEE PEE");
        ahs.addBook(0, b);
        System.out.println(ahs);
        
    }
}
