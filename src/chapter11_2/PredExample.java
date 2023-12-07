package chapter11_2;
import java.util.function.Predicate;
public class PredExample {
    public static void main(String[] args) {

        boolean result = pred(20, (i) -> (i >= 10));

        System.out.print(result);
    }

    public static boolean pred(int number, Predicate<Integer> pr){
        return pr.test(number);
    }
}
