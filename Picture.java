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
    private Square square;
    private Person person;
    private Triangle triangle;
    private Triangle triangle1;
    private Triangle triangle2;
    private Circle circle;
    private Circle circle1;
    private Circle circle2;
    private Circle circle3;
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
        
        
        triangle = new Triangle();  
        triangle.changeSize(60, 700);
        triangle.moveHorizontal(140);
        triangle.moveVertical(100);
        triangle.makeVisible();
        
        triangle1 = new Triangle();  
        triangle1.changeColor("green");
        triangle1.changeSize(60, 700);
        triangle1.moveHorizontal(-20);
        triangle1.moveVertical(100);
        triangle1.makeVisible();
        
        person = new Person();
        person.changeColor("black");
        person.moveHorizontal(-160);
        person.moveVertical(20);
        person.makeVisible();
        
        square = new Square();
        square.changeColor("blue");
        square.moveHorizontal(-210);
        square.moveVertical(130);
        square.changeSize(40);
        square.makeVisible();

        triangle2 = new Triangle();  
        triangle2.changeSize(120, 140);
        triangle2.moveHorizontal(60);
        triangle2.moveVertical(-80);
        triangle2.makeVisible();

        circle = new Circle();
        circle.changeColor("yellow");
        circle.moveHorizontal(140);
        circle.moveVertical(-80);
        circle.changeSize(50);
        circle.makeVisible();
        
        circle1 = new Circle();
        circle1.changeColor("white");
        circle1.moveHorizontal(15);
        circle1.moveVertical(20);
        circle1.changeSize(50);
        circle1.makeVisible();
        
        circle2 = new Circle();
        circle2.changeColor("red");
        circle2.moveHorizontal(25);
        circle2.moveVertical(30);
        circle2.changeSize(30);
        circle2.makeVisible();
        
        circle3 = new Circle();
        circle3.changeColor("black");
        circle3.moveHorizontal(30);
        circle3.moveVertical(35);
        circle3.changeSize(20);
        circle3.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (square != null)   // only if it's painted already...
        {
            square.changeColor("black");
            person.changeColor("black");
            triangle.changeColor("black");
            triangle1.changeColor("black");
            triangle2.changeColor("black");
            circle.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (square != null)   // only if it's painted already...
        {
            square.changeColor("red");
            person.changeColor("blue");
            triangle.changeColor("green");
            circle.changeColor("yellow");
        }
    }
}
