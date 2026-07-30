package Functional_Programing;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        int newSum = numbers.stream()
                .reduce(0,new BinaryOperator<Integer>() {
                    @Override
                            public Integer apply(Integer integer,Integer integer2){
                        return integer + integer2;
            }
                });
        System.out.printf("\nsum using reduce is %d", newSum);
        int newSum2 = numbers.stream()
                .reduce(0,(a,b) -> a + b);
        System.out.println("\nsum using reduce is " + newSum2);
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE,(a, b) -> a > b ? a : b);
        System.out.println("\nmax using reduce is %d , max");
    }
}
