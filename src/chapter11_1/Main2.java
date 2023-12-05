package chapter11_1;

public class Main2 {
    public static void main(String[] args) {
        Greeting g = (name) -> {
        return "Hello, " + name;
        };

        String s = g.sayHello("Kakky");
        System.out.println(s);
    }
}
