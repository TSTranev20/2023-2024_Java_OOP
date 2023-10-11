package task1;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double sum = 0;
        double n2 = n;
        for(int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(scan.nextLine());
            sum+=num;
        }
        System.out.println(factorial(sum, n2));
    }
    public static double factorial(double sum, double n)
    {
        return sum / n;
    }
}
