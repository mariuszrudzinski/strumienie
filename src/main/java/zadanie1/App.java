package zadanie1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    static void main() {
        List<Integer> numbers = Arrays.asList(15, 8, 23, 4, 42, 16, 11, 30, 7, 19, 2, 35, 28, 13, 6);

        List<Integer> evenNumbersSorted = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .toList();

        System.out.println(evenNumbersSorted);
    }
}
