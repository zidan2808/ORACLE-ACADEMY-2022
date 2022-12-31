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
        showStatus();
    }
    
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage gameOver;
    private int lives;
    private int pizzaEaten;
    private int score;
    
    public Robot()
    {
        robotimage1 = new GreenfootImage("man01.png");
        robotimage2 = new GreenfootImage("man02.png");
        gameOver    = new GreenfootImage("gameover.png");
        
        lives = 3;
        pizzaEaten = 0;
        score = 0;
    }
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
            animate();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
            animate();
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
            animate();
        }
    }
    public void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav"); 
            removeLife(); 
        }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife(); 
        }
    }
    public void detectHome()
    {
        if (isTouching(Home.class) && pizzaEaten==5)
        {
                increaseScore();
                Greenfoot.playSound("yipee.wav");
                setLocation(48,50);
                pizzaEaten=0;
        }
    }
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    public void animate()
    {
        if (getImage().equals(robotimage1))
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
    }
    public void removeLife()
    {
        lives=lives-1;
        testEndGame();
        showStatus();
    }
    public void testEndGame()
    {
        if (lives < 0)
        {
            setImage(gameOver);
            Greenfoot.stop();
        }
    }
    public void increaseScore()
    {
        if (pizzaEaten==5)
        {
            score++;
        }
        showStatus();
    }
    public void showStatus()
    {
        getWorld().showText("Lives : "+lives,71,530);
        getWorld().showText("Pizza : "+pizzaEaten,71,555);
        getWorld().showText("Score : "+score,71,580);
    }
}
