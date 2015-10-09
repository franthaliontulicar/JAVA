/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square floor;
    private Person strider;
    private Circle circulo1;
    private Circle circulo2;
    private Circle circulo3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        floor = new Square();
        floor.changeSize(1500);
        floor.changeColor("green");
        floor.moveVertical(140);
        floor.moveHorizontal(-500);
        floor.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
         circulo1 = new Circle();
        circulo1.changeColor("red");
        circulo1.moveHorizontal(-120);
        circulo1.moveVertical(50);
        circulo1.changeSize(80);
        circulo1.makeVisible();
        
        circulo2 = new Circle();
        circulo2.changeColor("blue");
        circulo2.moveHorizontal(-180);
        circulo2.moveVertical(30);
        circulo2.changeSize(80);
        circulo2.makeVisible();
       
        circulo3 = new Circle();
        circulo3.changeColor("green");
        circulo3.moveHorizontal(-170);
        circulo3.moveVertical(20);
        circulo3.changeSize(80);
        circulo3.makeVisible();        
        
        
        strider = new Person();
        strider.makeVisible();
        strider.moveHorizontal(-200);
        strider.moveVertical(30);
        strider.slowMoveHorizontal(80);
        
       
       
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            floor.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
           
        }
    }
    
    public void moveSun(){
         
    sun.slowMoveVertical(120); 
    setBlackAndWhite(); 
      
    }
    
    public void circulos(){
    
        circulo1.slowMoveHorizontal(100);
        circulo2.slowMoveVertical(-20);
        circulo3.slowMoveVertical(20);
    
    }
}
