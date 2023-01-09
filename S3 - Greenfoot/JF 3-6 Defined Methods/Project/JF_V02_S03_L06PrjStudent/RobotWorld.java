import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
* @author (2115101013_Darmawan Jiddan) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    private void prepare(){
        
        //Add Robot and get placement for Robot
        Robot robot = new Robot();
        addObject(robot,48,50);
        
        //Add Brick and get placement for Brick
        Wall wall1 = new Wall();
        addObject(wall1,52,147);
        Wall wall2 = new Wall();
        addObject(wall2,159,147);
        Wall wall3 = new Wall();
        addObject(wall3,266,147);
        Wall wall4 = new Wall();
        addObject(wall4,587,147);
        Wall wall5 = new Wall();
        addObject(wall5,692,147);
        Wall wall6 = new Wall();
        addObject(wall6,791,147);
        
        //Add Block and get placement for Block
        Block block = new Block();
        addObject(block,427,145);

        //Add Home and get placement for Home
        Home home = new Home();
        addObject(home, 751,552);

        //Add Scorepanel and get placement for Scorepanel
        Scorepanel scorePanel = new Scorepanel();
        addObject(scorePanel,71,554);

        //Add 5 pizza and get placement for them
        Pizza pizza1 = new Pizza();
        addObject(pizza1,720,46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,433,38);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,183,302);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,682,312);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,417,537);
        
    }
    
    private void call()
    {
        //method call to the prepare method in the constructor.
    }
    
}
