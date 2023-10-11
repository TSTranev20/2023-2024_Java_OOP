package task7;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] arr = new String[100];

        String s = scan.nextLine();
        String str = " ";
        int c = 0;
        for(int i = 0; i < s.length();i++)
        {
            if(s.charAt(i)!= ' ')
            {
                str += s.charAt(i);
            }
            else {
                arr[c] = str;
                c+=1;
            }
        }
        for(int i = 0; i < c; i++)
        {
            System.out.printf("%s ", arr[i]);
        }
    }
}
