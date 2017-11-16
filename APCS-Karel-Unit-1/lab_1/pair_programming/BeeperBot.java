package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  N. Kessenich
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnRight();
        turnRight();
        move();
        move();
        turnRight_move3();
        turnRight_move3();
        turnRight();
        turnRight_move3();
        move3();
        turnLeft();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move3(){
        move();
        move();
        move();
    }
    public void turnRight_move3(){
        pickBeeper();
        move3();
        turnRight();
    }
}

