
/**
 * Write a description of class PetDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetDriver
{
    // instance variables - replace the example below with your own
    public static void main(){
        Pet Bob = new Pet(100000, "Bob");
        System.out.println(Bob);
        Pet Mike = new Pet(100000, "Mike");
        System.out.println(Mike.equals(Bob));
        Pet.exsample();
    }
}
