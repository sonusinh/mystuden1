import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testclass1 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("10", "45", "6", "989", "90");
        List<String> even = numbers.stream().filter(s -> s.startsWith("9")).collect(Collectors.toList());
        List<String> even1= numbers.stream().filter(s -> s.equals("6")).collect(Collectors.toList());
        List<String> even3 = numbers.stream().filter(s -> s.endsWith("9")).collect(Collectors.toList());
        System.out.println(even);
        System.out.println(even1);
        System.out.println(even3);
    }
}
