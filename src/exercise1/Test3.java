package exercise1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextInt();
        // int i = sc.nextInt();

        // if (sc.hasNext()){
            // System.out.println("数値です");
        // } else {
            // System.out.println("数値ではありません");
        // }

        // if (sc.hasNextLine()){
            // System.out.println("文字列です");
        // } else {
            // System.out.println("文字列ではありません");
        // }

        // ENTERという文字列が入力するまで標準入力を受け付け、入力された数値を足していく。最後、この合計を表示する。
        // while文を使う

        // ENTERが入力されるまでループ
        int sum = 0;
        boolean isExit = false;

        while (isExit == false){
            if (sc.hasNextInt()){
                int number = sc.nextInt();
                sum = sum + number;

            } else if(sc.hasNextLine()){


                String s = sc.nextLine();
                if (s.equals("ENTER")){
                    isExit = true;
                }
            }
        }

        System.out.println(sum);
    }
}
