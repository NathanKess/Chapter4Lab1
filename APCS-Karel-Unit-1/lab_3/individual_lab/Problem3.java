package lab_3.individual_lab;

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
    }
    public void carpetRooms(){
        Enter();
        Walls();
        Enter();
        Walls();
        Enter();
        Walls();
        Enter();
        Walls();
        Enter();
        Walls();
        Enter();
        Walls();
        Enter();
        Walls();
        Enter();
        Walls();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void Enter(){
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void turnLeft2(){
        turnLeft();
        turnLeft();
    }
    public void Walls(){
        //int asdf=0; asdf++; asdf--;
        if (!frontIsClear()){
            turnLeft2();
            if (!frontIsClear()){
                turnRight();
                if (!frontIsClear()){
                    putBeeper();
                    turnRight();
                    Return();
                }
                else{
                    move();
                    turnRight();
                    Walls();
                }
            }
            else{
                turnLeft();
                move();
                turnLeft();
                ReturnNo();
            }
        }
        else{
            turnRight();
            move();
            turnLeft();
            ReturnNo();
        }
    }
    public void Return(){
        if (!frontIsClear()){
            turnLeft2();
            if (!frontIsClear()){
                putBeeper();
                turnLeft();
                move();
                turnLeft();
                Return();
            }
        }
    }
    public void ReturnNo(){
        if (!frontIsClear()){
            turnLeft2();
            if (!frontIsClear()){
                turnLeft();
                move();
                turnLeft();
                ReturnNo();
            }
        }
    }
    public void exit(){
        move();
        turnLeft();
    }
    public void putMove(){
        move();
        putBeeper();
    }
}

