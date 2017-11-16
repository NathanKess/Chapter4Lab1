
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String color;
    private int Engin;
    
    public Car(String carColor, int numCilinders)
    {
        // initialise instance variables
        this.color = carColor;
        this.Engin = numCilinders;
    }
    public void ThisCar(){
        System.out.println("This cars color is "+ this.color);
    }
    public int getEngin(){
        return this.Engin;
    }
    public boolean equals(Car other){
        if (this.color.equals(other.color) && this.Engin == other.Engin){
            return true;
        }
        else{
            return false;
        }
    }
}
