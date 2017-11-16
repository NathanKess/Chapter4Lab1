
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    private int age;
    private String name;
    private static int numPets;
    /**
     * Constructor for objects of class Pet
     */
    public Pet()
    {
        // initialise instance variables
        
    }
    public Pet(int num, String nm){
        this.age = num;
        this.name = nm;
        numPets++;
    }
    public String toString(){
        return "The Pets name is: "+ this.name;
    }
    public boolean equals(Pet other){
        if (this.name.equals(other.name)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void exsample(){
        System.out.println("This is in a static method!");
    }
}
