package lab_1.individual_lab;
import kareltherobot.*; 

/**
 * @author :  N. Kessenich
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void shuttleRace() {
        loopOne();
        loopTwo();
    }
    public void loopOne(){
        turnLeft();
        move();
        move2Right();
        move2Right();
        move2Left();
        turnLeft();
        move();
        Reset();
    }
    public void loopTwo(){
        move2Right();
        move2Right();
        move2Left();
        turnLeft();
        move();
        Reset();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move2(){
        move();
        move();
    }
    public void move2Right(){
        turnRight();
        move2();
    }
    public void move2Left(){
        turnLeft();
        move2();
    }
    public void Reset(){
        move();
        move2Left();
        move2Left();
        move2Right();
        move2Right();
    }
    public void reset2(){
        
    }
}