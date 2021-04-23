import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
*
*Die class .
*@author Jason Cusolito
*/

public class Die extends ShapeGroup
{
    private Rectangle dieframe;
    private  Ellipse dot1 , dot2 , dot3 , dot4 , dot5 , dot6 , dot7;
    private int m = 7;
    private int n = 1;
    private int val1;
/**
*
*Die constructor .
*
*@param x int
*@param y int
*/  
    public Die( int x , int y )
    {
        dieframe = new Rectangle ( x , y );
        dieframe.setFrameColor( Color.BLACK );
        dieframe.setFillColor( Color.WHITE );
        dieframe.setSize( 80 , 80 );
        
        dot1 = new Ellipse( x + 10 , y + 10 );
        dot1.setColor( Color.BLACK );
        dot1.setSize( 15 , 15 );
        
        dot2 = new Ellipse( x + 52 , y + 10 );
        dot2.setColor( Color.BLACK );
        dot2.setSize( 15 , 15 );
        
        dot3 = new Ellipse( x + 10 , y + 35 );
        dot3.setColor( Color.BLACK );
        dot3.setSize( 15 , 15 );
        
        dot4 = new Ellipse( x + 52 , y + 35 );
        dot4.setColor( Color.BLACK );
        dot4.setSize( 15 , 15 );
        
        dot5 = new Ellipse( x + 10 , y + 60 );
        dot5.setColor( Color.BLACK );
        dot5.setSize( 15 , 15 );
        
        dot6 = new Ellipse( x + 52 , y + 60 );
        dot6.setColor( Color.BLACK );
        dot6.setSize( 15 , 15 );
        
        dot7 = new Ellipse( x + 32 , y + 34 );
        dot7.setColor( Color.BLACK );
        dot7.setSize( 15 , 15 );
        
        dot7.hide( );
        
        
        
        add( dot1 );
        add( dot2 );
        add( dot3 );
        add( dot4 );
        add( dot5 );
        add( dot6 );
        add( dot7 );
        

        
        
    }
/**
*
*setDieColor method .
*
*@param c Color
*/        
    public void setDieColor ( Color c )
    {
        
        dieframe.setFillColor ( c );
        
    }
/**
*roll method .
*/
    
    public void roll ()
    {
        Random rand = new Random( );
        val1 = n + rand.nextInt( m - n );

        if ( val1 == 6 )
        {
            dot7.hide( );
            dot1.show( );
            dot2.show( );
            dot3.show( );
            dot4.show( );
            dot5.show( );
            dot6.show( );
            
            
        }
        else if ( val1 == 5 )
        {
            dot3.hide( );
            dot4.hide( );
            dot7.show( );
            dot1.show( );
            dot2.show( );
            dot5.show( );
            dot6.show( );
            
        }
        else if ( val1 == 4 )
        {
            dot7.hide( );
            dot3.hide( );
            dot4.hide( );
            dot1.show( );
            dot2.show( );
            dot5.show( );
            dot6.show( );
        }
        else if ( val1 == 3 )
        {   
            dot3.hide( );
            dot4.hide( );
            dot5.hide( );
            dot2.hide( );
            dot7.show( );
            dot1.show( );
            dot6.show( );
        }
        else if ( val1 == 2 )
        {
            dot1.hide( );
            dot3.hide( );
            dot4.hide( );
            dot6.hide( );
            dot7.hide( );
            dot2.show( );
            dot5.show( );
        }
        else if ( val1 == 1 )
        {
            dot1.hide( );
            dot2.hide( );
            dot3.hide( );
            dot4.hide( );
            dot5.hide( );
            dot6.hide( );
            dot7.show( );
        }
        
        

    
    }
/**
*getVal method .
*
*@return int
*/

   
    public int getVal ( )
    {
        return val1;
    }
/**
*
*main method .
*
*@param args String []
*/
    
    
    public static void main ( String args [ ] )
    {
        new Frame( );
        Die die1 = new Die ( 100 , 100 );
        //die1.roll( );
        
    
    }
    
  





}