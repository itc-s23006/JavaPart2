package exercise4;

public class Test1 {
    public static void main(String[] args) {
        /* int 4
        * double 8
        * float 4
        * short 2
        * byte 1
        * long 8
        * char 2
         */

        byte a = 5;
        short b = a;
        int c = a + b;
        long d = c * c;

        double d2 = 10.5;
        /* この数をint型の整数に入れる。 */
        int i2 = (int) d2;
        System.out.println(i2);

        byte b1 = 110;
        byte b2 = 120;
        byte b3 = (byte) (b1 * b2);
        System.out.println(b3);
    }
}
