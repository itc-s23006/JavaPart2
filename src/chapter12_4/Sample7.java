package chapter12_4;

import java.util.ArrayList;
import java.util.HashMap;

public class Sample7 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Kotlin");
        list.add("Python");

        list.forEach(System.out::println);

        var map = new HashMap<Integer,String>();
        for (int i=0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
