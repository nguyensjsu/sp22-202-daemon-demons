import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
/**
 * Write a description of class GameSettingsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameSettingsScreen extends World
{

    /**
     * Constructor for objects of class GameSettingsScreen.
     * 
     */
    public GameSettingsScreen()
    {    
        super(900, 650, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage gameLogo = new GreenfootImage("game_logo.png");
        gameLogo.scale(400,400);
        Logo logo = new Logo(gameLogo);
        addObject(logo, 200, 130);
        logo.setLocation(440,165);
        
        /*
         *  GreenfootImage gameLogo = new GreenfootImage("game_logo.png");
        gameLogo.scale(500,500);
        Logo logo = new Logo(gameLogo);
        addObject(logo, 200, 130);
        logo.setLocation(440,175);
         */
        
        BulletSpeed bulletSpeed = new BulletSpeed();
        addObject(bulletSpeed,259,160);
        
        //JetSpeed jetSpeed = new JetSpeed();
        // addObject(jetSpeed,240,278);

        Back back = new Back();
        addObject(back,279,327);
        
        // get speed
        int speed = Bullet.getSpeed();
        SpeedLabel speedLabel = new SpeedLabel(String.valueOf(speed));
        addObject(speedLabel, 300, 300);
        
        bulletSpeed.setLocation(200, 420);
        speedLabel.setLocation(460, 420);
        //settings.setLocation(300, 325);
        //quit.setLocation(300, 350);
    
        back.setLocation(160,500);
        
        
    }
}
