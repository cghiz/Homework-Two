import java.util.Scanner;
public class HW2P4
{
    public static void main(String[] args)
    {
        System.out.println("Input a drawing of a bucket by using the symbols $,*, and @ as jems:");
        Scanner keyboard= new Scanner(System.in);
        int total=0;
        while(true)
        {
            String line= keyboard.nextLine();
            if (line.equals("-------"))
            {
                break;
            }
            for (int i=0;i<line.length();i++)
            {
                char ch= line.charAt(i);
                if (ch=='@')
                    total+=1000;
                else if(ch=='$')
                    total+=500;
                else if(ch=='*')
                    total+=300;
            }
        }
        System.out.println("$"+total);
    }
}
