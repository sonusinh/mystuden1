import lombok.Data;
import org.hibernate.Length;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testclass4 {
    public static void main(String[] args) {


        Function<String, Integer> result = str -> str.length();
        Integer val = result.apply("mike");
        System.out.println(val);
        test();


    }

    private static void test() {
        Function<Integer,Integer> result= i->i+15;
        Integer val1 = result.apply(30);
        System.out.println(val1);
        test1();
    }

    private static void test1() {
        List<Integer> data = Arrays.asList(10,20,45,37,24,90);
         List<Boolean> evenNumber = data.stream().map(i -> i % 2 == 0).collect(Collectors.toList());
       System.out.println(evenNumber);
        test2();
    }

    private static void test2() {
        List<String> data = Arrays.asList("MIKE","STALLIN","KING","CRYPTO","ETHEREUM","MATIC");
       List<String> data1 = data.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());
        System.out.println(data1);
        test3();

    }

    private static void test3() {
        List<String> data = Arrays.asList("MIKE","STALLIN","KING","CRYPTO","ETHEREUM","MATIC");
        List<String> data2 = data.stream().sorted().collect(Collectors.toList());
        System.out.println(data2);
        test4();
    }

    private static void test4() {
        List<Integer> data = Arrays.asList(567,67,234,89,05,342,10,50);
         List<Integer> sorted1 = data.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted1);
        test5();
    }

    private static void test5() {
        List<Integer> data = Arrays.asList(20,34,34,45,46,67,67,70,70,80,90,34,45,56,67);
         List<Integer> data5 = data.stream().distinct().collect(Collectors.toList());
        System.out.println(data5);
    }


}



