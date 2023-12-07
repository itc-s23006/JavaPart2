package chapter12_1;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
        // あいさつの文字列を配列に格納
        // String[] greetings = {"おはよう", "こんにちは", "こんばんは"};

        // 配列の要素を順に表示
        // for (String greeting : greetings) {
        // System.out.println(greeting);
    // }

        List<String> greetings = new ArrayList<>();
        greetings.add("おはよう");
        greetings.add("こんにちは");
        greetings.add("こんばんは");

        greetings.add("ありがとう");

         for (String s:greetings){
            System.out.println(s);
         }
        String s = greetings.get(0);
        System.out.println(s);
        if (s.equals("おはよう")){
            System.out.println("yes");
        }
        System.out.println(greetings.contains("good morning"));
        if (!greetings.isEmpty()){
            System.out.println(greetings.size());
        }
        greetings.remove(2);
    }
}
