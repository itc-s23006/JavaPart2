package exercise1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();
        // System.out.println(s);

        // int a = sc.nextInt();
        // System.out.println(a);

        // ~さん、こんにちはと10回出力する
        // for (int i = 0; i < 10; i++) {
            // System.out.println(a + "さん、こんにちは");
        // }

        // 2つの文字列が入力されて、同じ文字列だったら、同じ、それ以外は、違うと出力
        // String b = sc.nextLine();
        // String c = sc.nextLine();

        // if (b.equals(c)) {
            // System.out.println("同じ");
        // } else {
            // System.out.println("違う");
        // }

        // 文字列を取得し、入力された文字列の真ん中の部分を一文字抜き出す。ただし、文字列の長さが偶数の場合は二文字
        // System.out.println("文字を入力してください");
        // String d = sc.nextLine();

        // int b = 0;
        // int c = 0;

        // if (d.length() % 2 == 0) {
            // b = d.length() / 2 - 1;
            // c = 2;
        // } else {
            // b = d.length() / 2;
            // c = 1;
        // }

        // System.out.println(d.substring(b, b + c));

        // 入力された文字列に、a, i, u, e, oが含まれている値を求める
        System.out.println("文字を入力してください");
        String e= sc.nextLine();

        int d = 0;

        for (int i=0; i<e.length(); i++){
            char a = e.charAt(d);
            if (a == 'a' || a == 'i' || a == 'u' || a == 'e' || a == 'o'){
                d++;
            }
        }
        System.out.println(d);
    }
}
