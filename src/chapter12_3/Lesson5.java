package chapter12_3;

import java.util.TreeSet;

public class Lesson5 {
    public static void main(String[] args) {
        var tree = new TreeSet<Book>();
        tree.add(new Book("HTML5/CSS3"));
        tree.add(new Book("Next.js/React"));
        tree.add(new Book("WordPress"));
        tree.add(new Book("Java"));
        tree.add(new Book("Linuc"));

        tree.forEach(System.out::println);
    }
}
