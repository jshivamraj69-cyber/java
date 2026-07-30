package Functional_Programing;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class OptinalString {
    public static void main(String[] args) {
        System.out.println(toOptinal(null));
        System.out.println(toOptinal(""));
        System.out.println(toOptinal("pop"));
    }
    public static Optional<String> toOptinal(String str){
        if (str == null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
