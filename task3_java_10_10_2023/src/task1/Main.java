package task1;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double pi = Math.PI;

        System.out.println(pi*r*r*h);
    }
}
