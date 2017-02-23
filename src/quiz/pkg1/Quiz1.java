/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author bisef5371
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY "WIEN"
        City wien = new City();
        
        //CREATING NEW THINGS
        Thing thing = new Thing(wien, 4, 1);
        Thing thing2 = new Thing(wien, 3, 2);
        Thing thing3 = new Thing(wien, 2, 3);
        Thing thing4 = new Thing(wien, 1, 4);
        
        //CREATING NEW WALLS IN "STAIRCASE" FORMATION
        Wall wall = new Wall(wien, 4, 2, Direction.WEST);
        Wall wall2 = new Wall(wien, 4, 2, Direction.NORTH);
        Wall wall3 = new Wall(wien, 3, 3, Direction.WEST);
        Wall wall4 = new Wall(wien, 3, 3, Direction.NORTH);
        Wall wall5 = new Wall(wien, 2, 4, Direction.WEST);
        Wall wall6 = new Wall(wien, 2, 4, Direction.NORTH);
        Wall wall7 = new Wall(wien, 2, 5, Direction.NORTH);
        Wall wall8 = new Wall(wien, 2, 5, Direction.EAST);
        Wall wall9 = new Wall(wien, 3, 6, Direction.NORTH);
        Wall wall10 = new Wall(wien, 3, 6, Direction.EAST);
        Wall wall11 = new Wall(wien, 4, 7, Direction.NORTH);
        Wall wall12 = new Wall(wien, 4, 7, Direction.EAST);
        
        //CREATING NEW ROBOT "KRAZY"
        Robot krazy = new Robot(wien, 4, 0, Direction.EAST);
        krazy.move();
        krazy.pickThing();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.pickThing();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.pickThing();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.pickThing();
        krazy.move();
        krazy.putThing();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.putThing();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.putThing();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.putThing();
        krazy.turnLeft();
        krazy.move();
    }
}
