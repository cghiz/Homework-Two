import java.util.Scanner;
public class HW2P8
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            String[] words = new String[100];
            int count = 0;
            while (true) {
                String word = keyboard.next();
                if (word.equals(".")) {
                    break;
                }
                words[count] = word;
                count++;
            }
            for (int i = 0; i < count - 1; i++) {
                int smallest = i;
                for (int j = i + 1; j < count; j++) {
                    if (words[j].compareTo(words[smallest]) < 0) {
                        smallest = j;
                    }
                }
                String temp = words[i];
                words[i] = words[smallest];
                words[smallest] = temp;
            }
            for (int i = 0; i < count; i++) {
                System.out.print(words[i]);
                if (i < count - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (count == 1) {
                break;
            }
        }
    }
}
