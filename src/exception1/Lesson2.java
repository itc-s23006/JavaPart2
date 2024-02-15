package exception1;

import java.net.InterfaceAddress;
import java.util.List;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> students = List.of("Java", "Minami", "Haruka");

        /* 生徒の番号を入力したら名前を表示する(標準入力)。
        * 0:Java, 1:Minami, 2:Kaki
        * exitが入力されるまで続ける。
        * 例外が起きそうな処理を考えて入れる。*/
        while (true) {
            System.out.println("生徒の番号を入力してください。");
            String s = sc.nextLine();
            /*
             if (s.equals("exit")) {
                break;
            }
            */

            try {
                int id = Integer.parseInt(s);
                System.out.println(students.get(id));
            } catch (NumberFormatException n) {
                System.out.println("登録されている番号を入力してください。");
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("該当する生徒は存在しません。");
            }
        }

        /* nが"0"だったら、Javaを出力。*/
    }
}
