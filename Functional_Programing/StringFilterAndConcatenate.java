package Functional_Programing;
import java.util.List;
public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> str = List.of("Shivam Raj","Good","Programmer","Quick learner",
                "Good Performance");
        String result = str.stream()
                .filter(s-> s.length() > 10)
                .reduce("",(a, b) -> a+" " + b);
        System.out.println(result);
    }
}
