package chapter11_2;
import java.util.function.Function;
public class FunExample {
    public static void main(String[] args) {
        // Function<String, Integer> f = String::length;
        // System.out.println(f.apply("hello"));

        Function<Integer, Double> f = a -> a / 2.0;
        System.out.println(f.apply(10));
    }
}
