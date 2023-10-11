package task6;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String w = scan.nextLine();
        String w2 = "";
        for(int i = w.length() - 1; i >= 0; i--)
        {
            w2 += w.charAt(i);
        }
        if(w2.equals(w))
        {
            System.out.println("It is a palindrom!");
        }
        else
        {
            System.out.println("It is not a palindrom!");
        }
    }
}
