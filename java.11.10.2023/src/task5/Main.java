package task5;
import java.util.Scanner;
import java.util.Random;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int rn = random.nextInt(100);
        r(rn);
        while(true)
        {
            int n = Integer.parseInt(scan.nextLine());
            if(n == rn)
            {
                System.out.printf("WOOOOOOOO!%nYEAHHHHH!%nCONGRATULATIONS!!");
                break;
            }
            if(n != rn)
            {
                if(n > rn)
                {
                    System.out.println("The  number is smaller!");
                }
                else
                {
                    System.out.println("The  number is bigger!");
                }
            }
        }


    }
    public static void r(int n)
    {
        if(n == 1)
        {
            System.out.println("The smallest number from 1 to 10!");
        }
        else if(n > 1 && n < 10)
        {
            System.out.println("The number is less than 10!");
            if(n % 2 == 0)
            System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 10 && n <= 20)
        {
            System.out.println("The number is between 9 and 21!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 21 && n <= 30)
        {
            System.out.println("The number is between 20 and 31!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 31 && n <= 40)
        {
            System.out.println("The number is between 30 and 41!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 41 && n <= 50)
        {
            System.out.println("The number is between 40 and 51!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 51 && n <= 60)
        {
            System.out.println("The number is between 50 and 61!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 61 && n <= 70)
        {
            System.out.println("The number is between 60 and 71!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 71 && n <= 80)
        {
            System.out.println("The number is between 70 and 81!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 81 && n <= 90)
        {
            System.out.println("The number is between 80 and 91!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else if(n >= 91 && n <= 99)
        {
            System.out.println("The number is between 90 and 100!");
            if(n % 2 == 0)
                System.out.println("The number is even!");
            else
                System.out.println("The number is odd!");
        }
        else {
            System.out.println("The biggest number from 1 to 100!");
        }
    }
}
