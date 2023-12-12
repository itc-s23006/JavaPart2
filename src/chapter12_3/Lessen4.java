package chapter12_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lessen4 {
    public static void main(String[] args) {


        List<Mountain> mountainList = new ArrayList<>();
        mountainList.add(new Mountain("Logos", 14255));
        mountainList.add(new Mountain("Elbert", 14433));
        mountainList.add(new Mountain("Maroon", 14156));
        mountainList.add(new Mountain("Castle", 14265));

        mountainList.sort(Comparator.comparing(Mountain::getName));
        mountainList.forEach(System.out::println);

        System.out.println();

        mountainList.sort(Comparator.comparing(Mountain::getHeight).reversed());
        mountainList.forEach(System.out::println);
    }
}
