package chapter12_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        movies.add("Avator");
        movies.add("Titanic");
        movies.add("spider-Man");
        movies.add("Frozen");
        movies.add("2012");

        movies.sort(Comparator.naturalOrder());

        movies.forEach(System.out::println);
    }
}
