import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> numbersCopy = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        Optional<Integer> evenNumbers = numbers.filter(n -> n % 2 == 0).reduce((x, y) -> x + y);
        Optional<Integer> oddNumbers = numbersCopy.filter(n -> n % 2 != 0).reduce((x, y) -> x + y);
        System.out.println("Сумма четных: " + evenNumbers.get());
        System.out.println("Сумма нечетных: " + oddNumbers.get());

        //TODO TASK 2

        Stream<String> words = Stream.of("Hello", "World", "Hell", "Of", "World");
        List<String> copyWords = (List<String>) words.distinct().toList();
        System.out.println(copyWords);
    }
}