import java.util.Scanner;
public class HW2P5
{
    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);
        String line;
        int firstPosition=0;
        int secondPosition=0;
        int row=0;
        while(true)
        {
            line = keyboard.nextLine();
            if (line.equals("---")) {
                break;
            }
            if (line.indexOf("c") != -1) {
                firstPosition = row;
            }
            row++;
        }
        int totalRows=row;
        row=0;
        for (int i=0;i<totalRows;i++)
        {
            line = keyboard.nextLine();
            if (line.indexOf("c") != -1)
            {
                secondPosition = row;
            }
            row++;
        }
        //System.out.println("First position="+firstPosition);
        //System.out.println("Second position="+secondPosition);
        int distanceRows= firstPosition-secondPosition;
        double miles= distanceRows/100.0;
        double mph=miles*3600;
        int over=(int)mph-30;
        int fine=0;
        if(over>0)
        {
            fine=over*10;
        }
        System.out.println("$"+ fine);
    }
}
