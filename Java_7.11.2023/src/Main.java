import java.util.Scanner;
class MyThread extends Thread
{
    private int n = 0;
    private int k = 0;
    private int count = 0;
    public MyThread(int k, int n)
    {
        this.k = k;
        this.n = n;
    }
    public void run()
    {
        for(int i = 0; i < k; i++)
        {
            count+=n;
        }
        System.out.println(count);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner scan = new Scanner(System.in);
        int a = 1, b = 2;
        int k = Integer.parseInt(scan.nextLine());

        MyThread thread1 = new MyThread(k, a);
        MyThread thread2 = new MyThread(k, b);

        thread1.start();
        Thread.sleep(2000);
        thread2.start();
    }
}