
/**
 * This is a program that computes perimeter of a rectangle.
 *
 * @author (Jacob Baker)
 * @version (9/8/2018)
 */
import java.awt.Rectangle;
public class Perimeter
{
    public static void main(String[] arg) 
    {
  { 
      Rectangle box = new Rectangle(11,25,35,35);
      System.out.println(new Rectangle());
      String name = "Width";
      System.out.println(box.getWidth());
      System.out.println("Width" + box.getWidth());
      String nameh = "Height";
      System.out.println(box.getHeight());
      System.out.println("Height" + box.getHeight());
      int Width = 35;
      int Height = 25;
      int perimeter = 2 * (Height + Width);
      System.out.println("perimeter" + perimeter);
      System.out.println("Expected: 120");
  }
}
}
