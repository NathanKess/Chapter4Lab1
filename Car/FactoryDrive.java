
/**
 * Write a description of class FactoryDrive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FactoryDrive
{
    public static void main(String[] args){
        Factory tesla = new Factory("123 main st", 5);
        
        Car modelS = new Car("Blue", 1000);
        tesla.addCar(modelS ,0);
        System.out.println(tesla);
    }
}
