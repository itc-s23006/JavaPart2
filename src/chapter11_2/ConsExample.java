package chapter11_2;

import java.util.function.Consumer;

public class ConsExample {
    public static void main(String[] args) {
        Consumer<String> c = System.out::println;
        c.accept("Hello");
    }
}
