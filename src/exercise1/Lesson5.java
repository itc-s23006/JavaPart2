package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson5 {
    public static void main(String[] args) {

        /* Recods型のリストを作る。
         * 値は好きなように入れる。
         * その中から70点以下の要素を削除する。*/

        ArrayList<Recods> recods = new ArrayList<>();
        recods.add(new Recods("Haruka", 88));
        recods.add(new Recods("Ryu", 28));
        recods.add(new Recods("Minami", 77));

        Iterator<Recods> it = recods.iterator();
        while (it.hasNext()) {
            Recods r = it.next();
            if (r.score <= 70) {
                it.remove();
            }
        }
        System.out.println(recods);
    }
}

        class Recods {
            String name; // 生徒名
            int score; // 点数

            public Recods(String name, int score) {
                this.name = name;
                this.score = score;
            }

            @Override
            public String toString() {
                return "Recods{" +
                        "名前='" + name + '\'' +
                        ", スコア=" + score +
                        '}';
            }
        }
