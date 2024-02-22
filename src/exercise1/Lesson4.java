package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson4 {
    public static void main(String[] args) {

        /* 整数が入る空のリストを作る。
        * 適当に数字を追加してください。(要素数5つ)
        * 10より小さいものは削除する。*/
        ArrayList<Integer> number = new ArrayList<>();
        number.add(28);
        number.add(37);
        number.add(5);
        number.add(73);
        number.add(82);

        Iterator<Integer> it = number.iterator();
        while (it.hasNext()) {
            if (it.next() < 10) {
                it.remove();
            }
        }
        System.out.println(number);
    }
}
