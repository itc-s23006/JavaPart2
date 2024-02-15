package exception1;

public class Lesson5 {
    public static void main(String[] args) {

        /* checkAgeメソッドを呼び出す。
        * try-catch文を入れる。*/
        try {
            checkAge(10);
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
    }

    /* メソッド名:checkAge
    * 引数:整数　戻り値:なし
    * 引数の値が18より小さい場合、例外を発生させる。
    * 例外は、ArithmeticExceptionクラスを使う。
    * 表示させるメッセージは、「アクセスは拒否されました。」
    * 18以上の場合は、「認証されました。」と表示する。*/
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("アクセスは拒否されました。");
        } else {
            System.out.println("認証されました。");
        }
    }
}
