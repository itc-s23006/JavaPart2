package chapter11_2;
import java.util.function.Predicate;
public class PredExample2 {
    public static void main(String[] args) {
        String words = "apple banana cherry peach";
        Predicate<String> p = words::contains;
        System.out.println(p.test("apple"));
    }
}
