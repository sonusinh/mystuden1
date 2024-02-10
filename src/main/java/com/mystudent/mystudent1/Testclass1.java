package com.mystudent.mystudent1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Testclass1 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(20, 45, 78, 23, 54, 87, 90);
//        Predicate<Integer> val = x->x%2==0;
//        boolean result = val.test(45);
//        System.out.println(result);
        Predicate<String> val = str->str.equals("sonu");
        boolean results= val.test("stallin");
        System.out.println(results);
        test();

    }

    private static void test() {
                Predicate<Integer> val = x->x%2==0;
         boolean result = val.test(44);
          System.out.println(result);
    }


}