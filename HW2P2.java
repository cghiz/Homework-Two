import java.util.Scanner;
public class HW2P2
{
    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Give two words, of the same length, you would like compared:");
        String word1= keyboard.next();
        String word2= keyboard.next();
        for (int i=0;i<word1.length();i++)
        {
            if (word1.charAt(i) == word2.charAt(i))
            {
                System.out.println(word1.charAt(i));
            }
        }
    }
