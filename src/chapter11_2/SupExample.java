package chapter11_2;
import java.util.function.Supplier;
public class SupExample {
    public static void main(String[] args) {
        // Supplier<Double> randomvalue = () -> Math.random();
        Supplier<Double> randomvalue = Math::random;
        System.out.println(randomvalue.get());
    }
}
