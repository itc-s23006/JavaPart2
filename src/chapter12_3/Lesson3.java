package chapter12_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avator", 29.237, 2009));
        movies.add(new Movie("Titanic", 22.667, 1997));
        movies.add(new Movie("Spider-Man", 19.218, 2021));
        movies.add(new Movie("Frozen", 13.343, 2013));
        movies.add(new Movie("2012", 7912, 2009));

        movies.sort(Comparator.comparing(Movie::getTitle));
        movies.forEach(System.out::println);
    }
}
