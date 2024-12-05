import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCaoncat {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("grape", "melon", "pineapple");

        List<String> concat = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

        System.out.println(concat);

    }
}