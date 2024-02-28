import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String expression = scan.nextLine();

        ArrayDeque <Integer> openBracketIndexStack = new ArrayDeque<>();

        for(int i = 0; i < expression.length();i++)
        {
            if(expression.charAt(i) == '(')
            {
                openBracketIndexStack.push(i);
            }

            if(expression.charAt(i) == ')')
            {
                System.out.println(expression.substring(openBracketIndexStack.pop(), i + 1));
            }
        }
    }
}