import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
import java.util.Random;

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{
    private JetOneScoreDisplay jetOneScoreDisplay;
    private JetTwoScoreDisplay jetTwoScoreDisplay;
    
    private int imageCount = 0;
    public int oldRandom = 0;  // keep track of previous random number
    
    // Creating an array of images
    String[] backgroundImages = {"cloud_white.png","cloudbackground1.jpeg", "cloud_red.jpeg"};
    int random = getRandom(backgroundImages);
    
    // Selects a random image and sets it as the background 
    GreenfootImage background = new GreenfootImage(backgroundImages[random]);
    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1); 

        jetOneScoreDisplay = JetOneScoreDisplay.getInstance();
        jetTwoScoreDisplay = JetTwoScoreDisplay.getInstance();
        setScreen();
    }
    
    private void setScreen() {
        addObject(jetOneScoreDisplay,100,70);
        addObject(jetTwoScoreDisplay,850,70);

        Actor timer = new TimerBlinkDecorator(new TimerDisplayDecorator(new Timer(GameConfig.gameDuration))); 
        addObject(timer, getWidth() / 2, 65);
        
        Jet jet1 = new Jet1(0, GameConfig.jetSpeed, GameConfig.bulletSpeed );
        addObject(jet1, 100, 325);
        
        Jet jet2 = new Jet2(1, GameConfig.jetSpeed, GameConfig.bulletSpeed );
        addObject(jet2, 800, 325);
    }
    
    public void act(){
        imageCount -= 3;
        animateImage(background);
    }
    
     /**
      * Create a dynamic moving background
      */
    public void animateImage(GreenfootImage image) {
        if (imageCount <  -image.getWidth()) {
            imageCount += image.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(image, temp, 0);
        getBackground().drawImage(image, temp + image.getWidth(), 0);
    }
     /**
      * Returns a random from 0 to the length of array
      * @param arr The array of image strings
      */
    public int getRandom(String[] arr){
        Random random = new Random();
        int num = random.nextInt(arr.length);
        while(num == oldRandom){
            num = random.nextInt(arr.length);
        }
        oldRandom = num;
        return num;
    }

}
