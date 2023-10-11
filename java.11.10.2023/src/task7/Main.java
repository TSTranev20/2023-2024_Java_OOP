package task7;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] arr = new String[100];

        String s = scan.nextLine();
        s+="";
        String str = "";
        int c = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!= ' ')// Agqga mama topki
            {
                str += s.charAt(i);
                if(i == (s.length() - 1))
                {
                    arr[c] = str;
                    c+=1;
                    str = "";
                }
            }
            if(s.charAt(i) == ' ')
            {
                arr[c] = str;
                c+=1;
                str = "";
            }
        }
        c-=1;
        for(int i = c; i >= 0; i--)
        {
            System.out.printf("%s ", arr[i]);
        }
    }
}
