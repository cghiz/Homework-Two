import java.util.Scanner;
public class HW2P1
{
    public static void main(String[] args)
    {
        System.out.print("Write a word:");
        Scanner keyboard= new Scanner(System.in);
        String word= keyboard.next();
        System.out.println("Now give the location of the letters you would like:");
        System.out.println("To break give a number that is larger than the word");
        while (keyboard.hasNextInt())
        {
            int index= keyboard.nextInt();
            if (index>=word.length())
            {
                break;
            }
            System.out.println(word.charAt(index));
        }
    }
}
