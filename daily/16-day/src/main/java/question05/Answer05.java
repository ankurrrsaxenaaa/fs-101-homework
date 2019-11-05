package question05;
import java.util.function.Function;

public class Answer05 {
    public static void main(String[] args) {
        Function<Object,String> stringFunction= Object::toString;
        Function<String,Integer> integerFunction= String::length;
        Function<Object,Integer> biFunction=stringFunction.andThen(integerFunction);
        System.out.println(biFunction.apply(new Animal("Cat")));
        System.out.println(biFunction.apply("Dog"));
    }
}
