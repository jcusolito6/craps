import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
*
*CrapsButton class .
*
*@author Jason Cusolito
*/

public class CrapsButton extends Rectangle
{

    private  TextBox textbox, pyb;
    private Die die1, die2;
    private Slider slider1;
   
/**
*
*CrapsButton constructor method .
*
*@param x int
*
*@param y int
*
*@param s Die
*
*@param ss Die
*
*@param x1 Slider
*/
    public CrapsButton ( int x , int y , Die s, Die ss, Slider x1 )
    {
        super( x , y );
        setSize ( 40 , 20 );
        textbox = new TextBox ( x , y - 30 );
        textbox.setSize ( 39 , 20 );
        textbox.setFrameColor ( Color.WHITE );
        textbox.setText ( "Roll" );
        die1 = s;
        die2 = ss;
        slider1 = x1;
    
    }
/**
*
*mousePressed method .
*
*@param e MouseEvent
*/
    
    public void mousePressed ( MouseEvent e )
    {   
        die1.roll( );
        die2.roll( );
        System.out.println( die1.getVal( ) + die2.getVal( ) );

        if ( die1.getVal( ) + die2.getVal( ) >= 5 && 
            die1.getVal( ) + die2.getVal( ) <= 9 )
        {
            die1.setDieColor ( Color.RED );
            die2.setDieColor ( Color.RED );
            slider1.calcCash( die1, die2 );
        }
                
              
        else if ( die1.getVal( ) + die2.getVal( ) == 2 )
        {
            die1.setDieColor ( Color.GREEN );
            die2.setDieColor ( Color.GREEN );
            slider1.calcCash( die1, die2 );
            
        
        }
        else if ( die1.getVal( ) + die2.getVal( ) == 3 )
        {
            die1.setDieColor ( Color.GREEN );
            die2.setDieColor ( Color.GREEN );
            slider1.calcCash( die1, die2 );
        
        }
        else if ( die1.getVal( ) + die2.getVal( ) == 4 )
        {
            die1.setDieColor ( Color.GREEN );
            die2.setDieColor ( Color.GREEN );
            slider1.calcCash( die1, die2 );
        
        }
        else if ( die1.getVal( ) + die2.getVal( ) == 10 )
        {
            die1.setDieColor ( Color.GREEN );
            die2.setDieColor ( Color.GREEN );
            slider1.calcCash( die1, die2 );
        
        }
        else if ( die1.getVal( ) + die2.getVal( ) == 11 )
        {
            die1.setDieColor ( Color.GREEN );
            die2.setDieColor ( Color.GREEN );
            slider1.calcCash( die1, die2 );
        
        }
        else if ( die1.getVal( ) + die2.getVal( ) == 12 )
        {
            die1.setDieColor ( Color.GREEN );
            die2.setDieColor ( Color.GREEN );
            slider1.calcCash( die1, die2 );
        
        }   
    
    }
/**
*
*main method .
*
*@param args String [ ] 
*/ 


    public static void main ( String[ ] args )
    {
        new Frame( );

        
    
    
    
    }








}