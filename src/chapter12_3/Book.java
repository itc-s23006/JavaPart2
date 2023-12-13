package chapter12_3;

import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Book book) {
        return name.compareTo(book.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
