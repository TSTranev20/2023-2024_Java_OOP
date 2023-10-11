package task3;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ifpr(n);
    }
    public static void ifpr(int n)
    {
        boolean f = false;

        for(int i = n-1; i > 1; i--)
        {
            if(n % i == 0)
            {
                f = true;
            }
        }
        if(f)
        {
            System.out.println("This number is not prime");
        }
        else
        {
            System.out.println("This number is prime");
        }
    }
}
