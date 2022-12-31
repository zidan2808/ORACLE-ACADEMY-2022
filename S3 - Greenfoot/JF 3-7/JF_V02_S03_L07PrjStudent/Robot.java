import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
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
        //Add a call to method within act() of class.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }
    }
    public void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav"); 
        }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectHome()
    {
        if (isTouching(Home.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("yipee.wav");
        }
    }
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
        }
    }
}
