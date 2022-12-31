import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (2115101032_Tegar Samjoe Indra LakaS) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
    }
     public void robotMovement()
    {
        //add the code for the robot movement in the next project section
    }
    public void detectWallCollision()
    {
        //if the robot collides with a Wall instance, then it returns to the start.
        if (isTouching(Wall.class))
        {
            setLocation(48,50);
        }
    }
    public void detectBlockCollision()
    {
        //the robot will return to the start if it collides with an instance of a Block.
        if (isTouching(Wall.class))
        {
            setLocation(48,50);
        }
    }
}
