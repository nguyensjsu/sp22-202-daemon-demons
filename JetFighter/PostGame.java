import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PostGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostGame extends World
{

    /**
     * Constructor for objects of class PostGame.
     * 
     */
    public PostGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        this(0, 0);
    }
    
    public PostGame(int xScore, int yScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1); 
        prepare();
    }
    
    private void prepare()
    {
        
        addObject(new GameOverText(), getWidth()/2, 100);
        addObject(new WinnerBanner(0,1), getWidth()/2, getHeight()/2);
        addObject(new Continue(), getWidth()/2, 500);
        addObject(new ExitGame(), getWidth()/2, 570);
    }
}
