package task2;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.println(factorial(n));
    }
    public static int factorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
}
