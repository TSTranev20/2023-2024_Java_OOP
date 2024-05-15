import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<String, Integer> stringToInt = e -> Integer.parseInt(e);
        Consumer<Integer> printNumber = e -> System.out.println(e + " ");


        stringToInt.apply("10");
        printNumber.accept(1);

        String[] inputNumbers = scanner.nextLine().split(", ");

        List<Integer> numbers = Arrays.stream(inputNumbers)
                .map(stringToInt)
                .collect(Collectors.toList());


        Predicate<Integer> oddNumbers = e -> e % 2 != 0;
        numbers.removeIf(oddNumbers);
        numbers.forEach(printNumber);


        BiFunction<Integer, Integer, Integer> compareTwoNumbers = (x, y) -> x.compareTo(y);
        numbers.sort(Integer::compareTo);
        numbers.forEach(printNumber);


        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get());

        BiFunction<Integer, String, String> intPlusStringToString = (a,b) -> a + b;
        System.out.println(intPlusStringToString.apply(10, " asd"));
    }
}