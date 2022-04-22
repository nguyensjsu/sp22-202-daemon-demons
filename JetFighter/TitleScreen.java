import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }
    
    private void prepare(){ 
        TitleLetters titleLetters = new TitleLetters(); 
        addObject(titleLetters, 200, 200); 
    }
    
    public void act(){ 
        if("enter".equals(Greenfoot.getKey())){
            Greenfoot.setWorld(new MenuScreen());
        }
    } 

}