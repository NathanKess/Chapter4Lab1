package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
        Hello();
    }
    public void Hello(){
        level1();
        level2();
    }
    public void level1(){
        turnRight();
        move();
        putBeeper();
        move3Place();
        move();
        move2();
        placeMove3();
        move2();
        placeMove3();
        move2();
        placeMove3();
        turnLeft();
        move();
        turnLeft();
    }
    public void level2(){
        move();
        PlacemovePlace();
    }
    public void PlacemovePlace(){
        putBeeper();
        move2();
        putBeeper();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move3Place(){
        move();
        move();
        move();
        putBeeper();
    }
    public void placeMove(){
        putBeeper();
        move();
    }
    public void placeMove3(){
        placeMove();
        placeMove();
        placeMove();
    }
    public void move2(){
        move();
        move();
    }
}