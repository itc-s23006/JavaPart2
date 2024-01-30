package exercise4;

import java.util.Scanner;

public class Marubatsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currenMark = 'X';


        /* 3行3列の二次元配列を作る。中身は空、char型。*/
        char[][] board = new char[3][3];

        /* この配列に-を代入する。*/
        for (int y = 0; y < 3; y++) {
            for (int t = 0; t < 3; t++) {
                board[t][y] = '-';
            }
        }


        /* この配列の中身を表示する。*/
        printBoard(board);

        /* 行番号と列番号を入力させる。*/
        System.out.println("行番号を入力してください。(上が1, 下が3)");
        int row = sc.nextInt() - 1;

        System.out.println("列番号を入力してください。(左が1, 右が3)");
        int col = sc.nextInt() - 1;

        boolean a = isValidMove(board, row, col);
        if (a == true) { /* その行と列の値をXにする。*/
            board[row][col] = currenMark;
        } else {
            System.out.println("選べません。");
        }

    }

    /* ユーザーの入力した行番号と列番号の値が1~3 かつ
    * XやOといった文字がすでに入っていないかチェック。
    * 上記の条件を満たしたとき true。
    * それ以外はfalseを返す。
    * メソッド名:isValidMove
    * 引数:対象の配列、行番号、列番号。
    * 戻り値:boolean
     */
    public static boolean isValidMove (char[][] board, int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (board[row][col] == '-') {
                return true;
            }
        }
        return false;
    }

    /* boardの中身を表示する部分を新しいメソッドにする。
    * メソッド名:printBoard
    * 引数:char型配列 (表示したい配列)
    * 戻り値: なし
     */
    public static void printBoard (char[][] board) {
        for (int t = 0; t < 3; t++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(board[t][y] + " ");
            }
            System.out.println();
        }
    }
}
/*
---
---
---

現在のプレイヤー:X
行番号を入力してください。(上が1, 下が3):
2
列番号を入力してください。(左が1, 右が3):
2

---
-X-
---

現在のプレイヤー:O
行番号を入力してください。(上が1, 下が3):
1
列番号を入力してください。(左が1, 右が3):
1
 */
