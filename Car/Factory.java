
/**
 * Write a description of class Factory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factory
{
    // instance variables - replace the example below with your own
    String address;
    Car[] inventory;
    
    /**
     * Constructor for objects of class Factory
     */
    public Factory(String st, int size)
    {
        // initialise instance variables
        this.address = st;
        this.inventory = new Car[size];
    }
    public String toString(){
        String output = "This is the factory Inventory:\n";
        for (Car c : inventory){
            output += c + "\n";
        }
        return output;
    }
    public void addCar(Car c, int spot){
        inventory[spot] = c;
    }
}
