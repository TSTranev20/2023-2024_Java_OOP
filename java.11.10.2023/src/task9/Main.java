package task9;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1 if you want to convert Celsius to Fahrenheit or 2 to convert Fahrenheit to Celsius!");
        String op = scan.nextLine();
        if(op.equals("1"))
        {
            double c = Double.parseDouble(scan.nextLine());
            System.out.println(cToF(c));
        }
        if(op.equals("2"))
        {
            double f = Double.parseDouble(scan.nextLine());
            System.out.println(fToC(f));
        }
    }
    public static double cToF(double c)
    {
        return (c * 9/5) + 32;
    }
    public static double fToC(double f)
    {
        return (f - 32) / 9 * 5;
    }
}
