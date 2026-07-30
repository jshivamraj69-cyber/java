package Functional_Programing;
import java.util.List;
import java.util.function.Consumer;

public class Filter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "banana", "grape");
        System.out.println(fruits.size());
        System.out.println("Printing Fruits normally");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("Printing Fruits using streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("Printing Fruits using filters");
        fruits.stream()
                .filter(fruit -> fruit.startsWith("b"))
                .forEach(fruit -> System.out.println(fruit));
    }
}