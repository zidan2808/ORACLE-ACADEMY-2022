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
        
        Block block = new Block();
        addObject(block,150,120);
    }
    
}
