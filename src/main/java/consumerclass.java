import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class consumerclass {
    public static void main(String[] args) {
        Consumer<Integer> result = number-> System.out.println(number);
        result.accept(100);
        test1();

    }

    private static void test1() {
        List<String> names= Arrays.asList("matic", "jupiter", "usdt", "tron");

        Consumer<String> val = name-> System.out.println(name);
                names.forEach(val);
        test2();
    }
     //SUPPLIER FUNCTIONAL INTERFACE
    private static void test2() {

        System.out.println(new Random().nextInt(100));//Random no. generate within 100 not otside 100
        System.out.println(new Random().nextInt(500));
       Supplier<Integer> x = ()->new Random().nextInt(100);
         Integer i = x.get();
        System.out.println(i);
    }
}
