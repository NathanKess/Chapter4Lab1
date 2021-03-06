package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    //your methods go below
    public void harvestOneRow(){
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
    }
    public void harvestTwoRows(){
        turnLeft();
        harvestOneRow();
        reposition();
        
    }
    public void reposistion(){
        turnRight();
        turnRight();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

