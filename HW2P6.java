import java.util.Scanner;
import java.awt.geom.Ellipse2D;
public class HW2P6
{
    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);
        double longitude,latitude;
        System.out.print("Enter your longitude and latitude:");
        longitude=keyboard.nextDouble();
        latitude=keyboard.nextDouble();
        Ellipse2D.Double sciencebuilding= new Ellipse2D.Double(-70.996,41.963,.060,.044);
        if (sciencebuilding.contains(longitude,latitude))
        {
            System.out.println("You are within a mile and a half from the Science Building!");
        }
        else
        {
            System.out.println("You are farther than a mile and a half from the science building.");
        }
    }
}
