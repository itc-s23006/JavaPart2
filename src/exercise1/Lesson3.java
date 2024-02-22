package exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {

        /* String型の値が入る空のリストを作ってください。
        * そこには、名前を入れます。
        * 3名ぐらい追加する。
        * 一覧を表示する。*/
        ArrayList<String> name = new ArrayList<>();
        name.add("Haruka");
        name.add("Ryu");
        name.add("Minami");
        name.add("_Miri");

        name.remove("Ryu");

        /* for (String s: name) {
             先頭の文字を調べる。
             * if(文字列.startsWith("調べたい文字"))
             if (s.startsWith("_")) {
                name.remove(s);
            }
            // System.out.println(name);
        } */

        Iterator<String> it = name.iterator();
        while (it.hasNext()) {
            if (it.next().startsWith("_")) {
                it.remove();
            }
            // System.out.println(it.next());
        }
        System.out.println(name);

    }
}
