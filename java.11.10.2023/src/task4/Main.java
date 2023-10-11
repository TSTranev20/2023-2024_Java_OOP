package task4;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();
        ifpr(n1, n2, operation);
    }
    public static void ifpr(int n1, int n2, String op)
    {
        if(op.equals("+"))
        {
            System.out.println(n1 + n2);
        }
        else if(op.equals("-"))
        {
            System.out.println(n1 - n2);
        }
        else if(op.equals("*"))
        {
            System.out.println(n1 * n2);
        }
        else if(op.equals("*"))
        {
            System.out.println(n1 * n2);
        }
        else if(op.equals("/"))
        {
            String er = "n2 is null";
            if(n2 != 0)
            {
                System.out.println(n1 / n2);
            }
            else
            System.out.println(er);
        }
        else if(op.equals("%"))
        {
            String er = "n2 is null";
            if(n2 != 0)
            {
                System.out.println(n1 % n2);
            }
            else
            System.out.println(er);
        }
    }
}
