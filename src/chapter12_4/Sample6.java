package chapter12_4;

import java.util.HashSet;

public class Sample6 {
    public static void main(String[] args) {

        var set = new HashSet<String>();
        set.add("山田");
        set.add("田中");
        set.add("池田");

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.remove("池田");
        set.forEach(System.out::println);
    }
}
