import java.util.Scanner;
public class HW2P3
{
    public static void main(String[] args)
    {
        System.out.print("What word would you like to look for?");
        Scanner keyboard =new Scanner(System.in);
        String search = keyboard.next();
        int count=0;
        System.out.print("Give a line to find the word from(with a space before the period at the end):");
        while(true)
        {
            String word= keyboard.next();
            if (word.equals("."))
            {
                break;
            }
            if (word.equals(search))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
