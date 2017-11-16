package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        set1pin();
        set2pin();
        set3pin();
        set4pin();
        set5pin();
        set6pin();
        set7pin();
    }
    public void set1pin(){
        move();
        putBeeper();
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
    public void putMove2(){
        putBeeper();
        move2();
    }
    public void set2pin(){
        rightConner();
        turnLeft();
        putMove2();
        putMove2();
    }
    public void rightConner(){
        turnRight();
        move();
        turnLeft();
        move();
    }
    public void set3pin(){
        leftConner();
        putMove2();
        putMove2();
        putMove2();
    }
    public void leftConner(){
        turnRight();
        move();
        turnRight();
        move();
    }
    public void supperRightCornner(){
        turnLeft();
        move();
        turnLeft();
        move();
    }
    public void set4pin(){
        supperRightCornner();
        putMove2();
        putMove2();
        putMove2();
        putBeeper();
        move();
    }
    public void set5pin(){
        turnRight();
        move();
        turnRight();
        move2();
        putMove2();
        putMove2();
        putMove2();
    }
    public void set6pin(){
        supperRightCornner();
        move2();
        putMove2();
        putMove2();
    }
    public void set7pin(){
        leftConner();
        move2();
        putMove2();
    }
}
