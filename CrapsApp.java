import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
*
*CrapsApp class . 
*
*@author Jason Cusolito
*/


public class CrapsApp
{


    protected Die die1, die2;
    private static Slider slider;

/**
*main method .
*@param args String []
*/    
  

    public static void main ( String [] args )
    {
        new Frame();
        Die die1 = new Die ( 100 , 0 );
        Die die2 = new Die ( 200 , 0 );
        slider = new Slider ( 129 , 250, die1, die2 );
        new CrapsButton ( 85 , 250, die1 , die2, slider );


        
        
    }
}