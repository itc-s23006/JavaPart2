package chapter12_3;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Sample6 {
    public static void main(String[] args) {
        var map = new LinkedHashMap<Integer, String>();
        map.put(205, "田中宏");
        map.put(100, "木村正一");
        map.put(300, "佐藤修");

        map.forEach((k, v)->System.out.println(k + " " + v));
    }
}
// 教科書P３０５の内容