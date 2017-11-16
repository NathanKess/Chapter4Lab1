
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Dice
{
    public static void main (String[] args)
   {
          Random generator = new Random();
          int Dice1, Dice2; 
          Dice1 = generator.nextInt(7);
 
          Dice2 = generator.nextInt(7);
 
          System.out.println ("Your you rolled a " + Dice1 + " and " + Dice2);
          System.out.println ("Total " + (Dice1+Dice2));
        }
}
