import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{

    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1); 
        
        TimerDisplay timer = new TimerDisplay();
        addObject(timer, 450, 40);
        
        Jet jet1 = new Jet1(0);
        addObject(jet1, 100, 325);
        
        Jet jet2 = new Jet2(1);
        addObject(jet2, 800, 325);
    }
}
