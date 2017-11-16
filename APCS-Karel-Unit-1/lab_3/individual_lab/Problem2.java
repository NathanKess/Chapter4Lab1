package lab_3.individual_lab;

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

    public void carpetRooms(){
        NextRoom();
        exitRoom();
        NextRoom();
        exitRoom();
        NextRoom();
        exitRoom();
        NextRoom();
        exitRoom();
        NextRoom();
        exitRoom();
        NextRoom();
        exitRoom();
        NextRoom();
        exitRoom();
        NextRoom();
        exitRoom();
    }
    public void NextRoom(){
        move();
        turnLeft();
        move();
        turnRight();
        CheckSurrounded();
    }
    public void TestNextRoom(){
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void exitRoom(){
        move();
        turnLeft();
    }
    public void CheckSurrounded(){
        if (!frontIsClear()){
            turnLeft();
            if (!frontIsClear()){
                turnLeft();
                if(!frontIsClear()){
                    turnLeft();
                    putBeeper();
                }
                else{
                    turnLeft();
                }
            }
            else {
                turnLeft();
                turnLeft();
            }
        }
        else {
            turnLeft();
            turnLeft();
            turnLeft();
        }
    }
}

