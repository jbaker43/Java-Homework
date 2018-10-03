/**
 * This program prints out a rectangle with dimensions.
 *
 * @author (Jacob Baker)
 * @version (9/7/2018)
 */
import java.awt.Rectangle;
public class RectangleObjects 
{
 public static void main(String[] arg) 
 {
  { 
      Rectangle box = new Rectangle(5,20,30,30);
      System.out.println(new Rectangle());
      String name = "Width";
      System.out.println(box.getWidth());
      System.out.println("Width" + box.getWidth());
      String nameh = "Height";
      System.out.println(box.getHeight());
      System.out.println("Height" + box.getHeight());
      System.out.println(box.getY());
      String namey = "Y";
      System.out.println("Y" + box.getY());
      String Namex = "X";
      System.out.println(box.getX());
      System.out.println("X" + box.getX());
      // Move the rectangle
      box.translate(10,15);
      System.out.print("x: ");
      System.out.println(box.getX());
      System.out.println("Expected: 15");
      System.out.print("y: ");
      System.out.println(box.getY());
      System.out.println("Expected: 35");
      System.out.println(box.getWidth());
      System.out.println(box.getHeight());
      }
}
}