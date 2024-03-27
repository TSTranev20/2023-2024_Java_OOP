import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally{
            System.out.println(
                    "Finally blockkkk");
        }
        /*  *//*int a = 10;
        int b = 0;*//*
        Scanner sc = new Scanner(System.in);
        try{

            int a = sc.nextInt(), b= sc.nextInt();

            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }
        *//*catch (ArithmeticException exception){
            System.out.println(exception);
        }
        catch (NumberFormatException exception){
            System.out.println(exception.getMessage());
        }*//*
        System.out.println("This code will execute");*/

        /* int a = sc.nextInt(), b= sc.nextInt();
         */


    }
    public static void read() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/a.tex"));
    }
} 