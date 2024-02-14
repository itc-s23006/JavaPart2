package exception1;

import java.net.InterfaceAddress;
import java.util.List;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> students = List.of("Java", "Kaki", "Minami");

        /* 生徒の番号を入力したら名前を表示する(標準入力)。
        * 0:Java, 1:Minami, 2:Kaki
        * exitが入力されるまで続ける。
        * 例外が起きそうな処理を考えて入れる。*/

        System.out.println("生徒の番号を入力してください。");
        String s = sc.nextLine();

        int id = Integer.parseInt(s);
        System.out.println(students.get(id));
        /* nが"0"だったら、Javaを出力。*/
    }
}
