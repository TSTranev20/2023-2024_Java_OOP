import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        while(!command.equals("End"))
        {
            command = scan.nextLine();

            String[] tokens = command.split("\\s+");
            String actualCommand = tokens[0];
             BankAccount bankAccount;
            if(actualCommand.equals("Create"))
            {
                bankAccount = new BankAccount();
            }
            else if(actualCommand.equals("Deposit"))
            {
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);
                bankAccount.deposit(amount);
            }
            else if(actualCommand.equals("SetInterest"))
            {

            }
            else if(actualCommand.equals("GetInterest"))
            {

            }
            else {
                System.out.println("Invalid command");
            }
            command = scan.nextLine();
        }
    }
}