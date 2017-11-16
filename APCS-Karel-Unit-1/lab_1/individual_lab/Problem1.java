package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnLeft();
        move2();
        rightMove();
        turnRight();
        pickMove4();
        pickBeeper();
        rightMove2();
        turnRight();
        placeMove5();
        rightMove2();
        move();
        turnRight();
    }
    public void move2(){
        move();
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void movePick(){
        pickBeeper();
        move();
    }
    public void rightMove(){
        turnRight();
        move2();
    }
    public void placeMove(){
        putBeeper();
        move();
    }
    public void rightMove2(){
        rightMove();
        rightMove();
    }
    public void placeMove5(){
        placeMove();
        placeMove();
        placeMove();
        placeMove();
        placeMove();
    }
    public void pickMove4(){
        movePick();
        movePick();
        movePick();
        movePick();
    }
}