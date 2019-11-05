package question01;
import java.util.function.BiFunction;

public class Answer01 {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> takeStringAndIntegerAndReturnInteger = (str, multiplier) -> str.length()*multiplier;
        System.out.println(takeStringAndIntegerAndReturnInteger.apply("Ankur",2));
    }
}
