package enum1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /* 標準入力で文字列を受け取ります。
        * MONDAY, TUESDAY .... SUNDAY */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Day d = Day.valueOf(s.toUpperCase());

        /* 列挙型を使う　かつ　swith文 */

        /* MONDAY 月曜日は憂鬱だ。
        * FRIDAY 金曜日は嬉しい。
        * SATURDAY, SUNDAY 土日は楽しい。
        * その他　普通　*/
        switch (d) {
            case MONDAY -> System.out.println("月曜日は憂鬱。");
            case FRIDAY -> System.out.println("金曜日は嬉しい。");
            case STATURDAY, SUNDAY -> System.out.println("土日は楽しい。");
            default -> System.out.println("普通");
        }
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    STATURDAY,
    SUNDAY
}
