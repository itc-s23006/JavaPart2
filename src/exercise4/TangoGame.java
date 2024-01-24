package exercise4;

import java.util.Random;

public class TangoGame {
    public static void main(String[] args) {
        /* 変数の定義
        * 答え
        * 入力値
        * チャレンジできる回数。
        * 答えを配列に入れる。
        */
        String[] ans_list = {"KAKI", "MAI"};
        Random r = new Random();
        int ran_num = r.nextInt(ans_list.length);
        String str = ans_list[ran_num];
        char[] ans_word = str.toCharArray();
        /* System.out.println(ans_word[0]); */

        /* _ で埋めたchar 型配列を作る。*/
        char[] guess = new char[ans_word.length];
        for (int i = 0; i < guess.length; i++) {
            guess[i] = '_';
        }
        System.out.print("現在の状態：");
        /* guessという配列の中身を表示する。 */
        /* 単語当てゲーム！
        * 現在の状態：_ _ _ _
        * 残り回数：５
        * １文字を入力してください。
         */
        /* どういう機能が必要か。（メソッド）
        * 答えと入力値が同じもじだったらtrueを返す。
        * 現在の状態を表示。
        * 回数を５回までにする。
        * ５回終わったらゲームオーバー。
        * 当たったらゲームクリア。
         */
    }
}
