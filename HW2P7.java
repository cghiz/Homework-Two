import java.util.Scanner;
public class HW2P7
{
    public static boolean Palidrome(int number)
    {
        String value= ""+number;
        for (int i=0;i< value.length()/2;i++)
        {
            if (value.charAt(i)!= value.charAt(value.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Input two numbers:");
        Scanner keyboard= new Scanner(System.in);
        int start=keyboard.nextInt();
        int end= keyboard.nextInt();
        for (int number=start;number<=end;number++)
        {
            if (Palidrome(number))
            {
                System.out.println(number);
            }
        }
    }
}
