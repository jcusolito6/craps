import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Random;


/**
*
*Slider class .
*
*@author Jason Cusolito
*/

public class Slider extends ShapeGroup
{
    private Rectangle slider, background;
    private Point lastMousePosition;
    private TextBox text1, text2, pyb;
    private Die die1, die2;
/**
*
*Slider constructor method .
*
*@param x int
*
*@param y int
*
*@param die11 Die
*
*@param die22 Die
*/
 
    public Slider( int x , int y, Die die11, Die die22 )
    {
        
        background = new Rectangle ( x , y );
        background.setFrameColor( Color.BLACK );
        background.setFillColor( Color.GRAY );
        background.setSize( 100 , 20 );
        
        slider = new Rectangle ( x , y );
        slider.setFrameColor( Color.BLACK );
        slider.setFillColor( Color.RED );
        slider.setSize( 100 , 20 );
        
        text1 = new TextBox ( x , y + 25 );
        text1.setSize( 100 , 20 );
        text1.setText( "$" + slider.getWidth() + " / " + "$"
             + background.getWidth() );
        text1.setFrameColor( Color.WHITE );
        
        text2 = new TextBox ( x , y - 30 );
        text2.setSize( 39 , 20 );
        text2.setFrameColor( Color.WHITE );
        text2.setText( "Bet: " );
        
        pyb = new TextBox ( x + 29 , y - 100 );
        pyb.setFrameColor ( Color.WHITE );
        pyb.setText( "Place your bet." );
        


        add( slider );

        

        

           
    }
    
    
/**
*
*calcCash method .
*
*@param di1 Die
*
*@param di2 Die
*/    
    
    public void calcCash( Die di1, Die di2 )
    {
        int loss;
        int current;
        int win;
        
        
        if ( di1.getVal() + di2.getVal( ) >= 5 
            && di1.getVal( ) + di2.getVal( ) <= 9 )
        {
            loss = background.getWidth( ) - slider.getWidth();
            current = background.getWidth( );
            background.setSize( loss  , 20 );
            slider.setSize( loss , 20 );
            text1.setText( "$" + slider.getWidth( ) + " / " + "$"
                 + background.getWidth( ) );
            pyb.setText( "You lost $" + ( current - loss ) );
            System.out.println( "Loss!" );
            
            
        }     
        else if ( di1.getVal( ) + di2.getVal( ) == 2 )
        {
            win = background.getWidth( ) + ( slider.getWidth( ) * 3 );
            current = background.getWidth( );
            background.setSize( win , 20 );
            slider.setSize( win , 20 );
            text1.setText( "$" + slider.getWidth() + " / "
                 + "$" + background.getWidth( ) );
            pyb.setText( "You won $" + ( win - current ) );
            System.out.println( "Win! 3:1" );
                 
        
        }
        else if ( di1.getVal( ) + di2.getVal( ) == 3
             || di1.getVal( ) + di2.getVal( ) == 4 )
        {
            win = background.getWidth( ) + slider.getWidth( ) ;
            current = background.getWidth( );
            background.setSize( win , 20 );
            slider.setSize( win , 20 );
            text1.setText( "$" + slider.getWidth( ) + " / " + "$" 
                + background.getWidth( ) );
            pyb.setText( "You won $" + ( win - current ) );

        }

        else if ( di1.getVal( ) + di2.getVal( ) == 10 
            || di1.getVal() + di2.getVal() == 11  )
        {
            win = background.getWidth( ) + ( slider.getWidth() * 2 );
            current = background.getWidth( );
            background.setSize( win , 20 );
            slider.setSize( win , 20 );
            text1.setText( "$" + slider.getWidth( ) + " / " + "$" 
                + background.getWidth( ) );
            pyb.setText( "You won $" + ( win - current ) );

        
        }

        else if ( di1.getVal( ) + di2.getVal( ) == 12 )
        {
            win = background.getWidth( ) + ( slider.getWidth( ) * 5 );
            current = background.getWidth( );
            background.setSize( win , 20 );
            slider.setSize( win , 20 );
            text1.setText( "$" + slider.getWidth( ) + " / " + "$"
                 + background.getWidth( ) );
            pyb.setText( "You won $" + ( win - current ) );
        
        }
        
        if ( background.getWidth( ) == 0 )
        {
            pyb.setText( "Game over! You have no money left. " );
        }
        
             
    }
/**
*
*mousePressed method .
*
*@param e MouseEvent
*/
    
    public void mousePressed( MouseEvent e )
    {
    
        lastMousePosition = e.getPoint( );

    
    }
/**
*
*mouseDragged method .
*
*@param e MouseEvent
*/
    


    public void mouseDragged( MouseEvent e )
    {
        Point currentPoint = e.getPoint( );
        int diffX = currentPoint.x - lastMousePosition.x;
        slider.setSize( slider.getWidth( ) + diffX , slider.getHeight( ) );
        lastMousePosition = currentPoint;

        if ( slider.getWidth( ) > background.getWidth( ) )
        {
            slider.setSize( background.getWidth( ) , background.getHeight( ) );

        
        }
    
        if ( slider.getWidth( ) < 0 )
        {
            slider.setSize( 0 , background.getHeight( ) );
        
        }
        
        text1.setText( "$" + slider.getWidth() + " / " + "$"
             + background.getWidth( ) );
   
    
    }
/**
*
*main method .
*
*@param args String [ ]
*/
   
    

    public static void main( String [] args )
    {
        new Frame( );

    
    
    }





}