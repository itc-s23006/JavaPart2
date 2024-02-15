package exception1;

public class Lesson4 {
    public static void main(String[] args) {
        /* try-catch文　
        * 0で割られたとき例外が発生するのを考慮して「0で割ることはできません。」と表示する。
        * divideNumを呼び出す。*/
        try {
            System.out.println(divideNum(2, 0));
        } catch (ArithmeticException a) {
            System.out.println("0で割ることはできません。");
        }
    }

    /* メソッド名:divideNum
    * 引数:2つ　ともに整数(a, b)
    * a / b した値を返す。*/
    /* throws ArithmeticException */
    static int divideNum(int a, int b) {
        int d = a / b;
        return d;
    }
}
