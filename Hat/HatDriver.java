
/**
 * Write a description of class HatDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HatDriver
{
    public static void main(){
        Hat tophat = new Hat("Purple", true);
        System.out.println(tophat.name());
        Hat poop = new Hat("Brown", false);
        System.out.println(poop.name());
    }
}
