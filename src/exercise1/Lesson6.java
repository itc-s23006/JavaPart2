package exercise1;

import java.util.HashMap;
import java.util.Map;

public class Lesson6 {
    public static void main(String[] args) {

        /* 空のMapを作る。
        * キーは文字列型、値は少数型。
        * キー:沖縄の観光名所
        * 値:おすすめ度 (0~5.0)
        * その値を追加してください。
        * すべて表示する。*/
        HashMap<String, Double> map = new HashMap<>();
        map.put("国際通り", 3.6);
        map.put("美ら海水族館", 4.6);
        map.put("首里城", 4.4);

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
