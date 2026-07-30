package Functional_Programing;

import java.util.List;

public class MethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .filter(num -> num %2 == 1)
                .forEach( System.out::println);

        numbers.stream()
                .filter(num -> num %2 == 1)
                .forEach(num -> System.out.println(num));

        int newsum2 = numbers.stream().
                reduce(0, Integer::sum);
        System.out.println(newsum2
        );
    }
}
