package exercise4;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /* 標準入力で取得した数値が
         * １０より大きいとき−１
         * １０より小さいとき１
         * １０と等しいとき０　を戻り値で返すメソッドを作る。
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("数値を入力してください。：");
        int inputNumber = sc.nextInt();
        int result = number(inputNumber);
        System.out.println("結果：" + result);
    }
        /* メソッド */
    public static int number(int num) {
        if (num > 10) {
            return -1;
        } else if (num < 10) {
            return 1;
        } else {
            return 0;
        }

    }
}
