
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    // instance vprivate int x;
    private String hatColor;
    private boolean Shit;
    /**
     * Constructor for objects of class Hat
     */
    public Hat(String color, boolean quality)
    {
        // initialise instance variables
        this.Shit = quality;
        this.hatColor = color;
    }
    public String name(){
        return "color of hat is: " + this.hatColor;
    }
}
