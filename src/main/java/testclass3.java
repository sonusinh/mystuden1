import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testclass3 {

    public static void main(String[] args) {
        Function<String,Integer> result=str->str.length();
        Integer val = result.apply("mike");
        System.out.println(val);
         test();

    }

    private static void test() {
        Function<Integer,Integer> result=i->i+10;
        Integer val = result.apply(30);
        System.out.println(val);

    }
}
