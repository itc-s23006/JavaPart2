package exercise4;
import java.util.Random;
import java.util.Scanner;

public class TangoGame {
    public static void main(String[] args) {

        /* 変数の定義。
        * 答え
        * 入力値
        * チャレンジできる回数。
        * 答えを配列に入れる。
        */
        String[] ans_list = {"KAKI", "MAIN"};
        Scanner sc = new Scanner(System.in);

        /* ランダムに答えを決め、char型配列。 */
        Random r = new Random();
        int ran_num = r.nextInt(ans_list.length);
        String str = ans_list[ran_num];
        char[] ans_word = str.toCharArray();
        /* System.out.println(ans_word[0]); */

        /* 正解が入っている配列は、ans_word。 */
        /* _ で埋めたchar 型配列を作る。*/
        char[] guess = new char[ans_word.length];
        for (int i = 0; i < guess.length; i++) {
            guess[i] = '_';
        }

        int count = 5;
        while (count > 0) {
            System.out.print("現在の状態：");

            /* printArayメソッドを呼び出す。*/
            printArray(guess);

            /* 「１文字を入力してください」と表示して、ユーザーが入力した文字を取得し変数に入れる。*/
            System.out.println("1文字を入力してください。");
            String s = sc.nextLine();
            char input = s.charAt(0);
            input = Character.toUpperCase(input);
            count--;

            /* guess配列を書き換える。
             * _ _ _ _ -> bが入力されたら B _ _ _
             */
            for (int i = 0; i < ans_word.length; i++) {
                if (ans_word[i] == input) {
                    guess[i] = input;
                }
            }
        }

        /* printArayメソッドを呼び出す。*/
        printArray(guess);

        /* 「１文字を入力してください」と表示して、ユーザーが入力した文字を取得し変数に入れる。*/
        System.out.println("1文字を入力してください。");
        String s = sc.nextLine();
        char input = s.charAt(0);
        input = Character.toUpperCase(input);

        /* guess配列を書き換える。
        * _ _ _ _ -> bが入力されたら B _ _ _
         */
        for (int i = 0; i < ans_word.length; i++) {
            if (ans_word[i] == input) {
                guess[i] = input;
            }
        }

        /* checkwinメソッドを使い、判定。
        * trueが返ってきたら正解ということ。
         */
        if (checkwin(guess)) {
            System.out.println("正解です！");
        }

        /* 単語当てゲーム！
        * 現在の状態：_ _ _ _
        * 残り回数：５
        * １文字を入力してください。：
        a
        * 現在の状態： _ _ _ _
        * 残り回数：４
        * １文字を入力してください。：
        b
         */

        /* どういう機能が必要か。（メソッド）
        * 答えと入力値が同じ文字だったらtrueを返す。
        * 現在の状態を表示。
        * 回数を５回までにする。
        * ５回終わったらゲームオーバー。
        * 当たったらゲームクリア。
         */

        /* guessという配列の中身を表示する。 */
        for (int i = 0; i < guess.length; i++) {
            System.out.print(guess[i] + " ");
        }
    }

    /* 配列の中身を表示するメソッドを作る。
    * 引数は、配列（char型）
    * printArayメソッド名。
     */
    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /* 判定するメソッド。
    * 引数はguess配列。
    * guess配列の要素にひとつでも_が含まれていたら、falseを返す。
    * _がひとつもなければtrueを返す。
     */
    public static boolean checkwin(char[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_') {
                return false;
            }
        }
        return true;
    }

}
