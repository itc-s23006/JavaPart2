package exercise1;

public class Test4 {
    public static void main(String[] args) {
        // 1から100まで数字を足す。ただし、3の倍数は除く。
        // int c = 0;
        // for (int i = 1; i <= 100; i++){
            // if (i % 3 == 0) {
                // continue;
            // }
            // c++;
        // }
        // System.out.println(c);

        /*
        2
        22
        222
        2222
        22222
        222222
        2222222
        22222222
        222222222
        2222222222
         最大 縦10  横 10
         */
        int white = 1;
        for (int I = 0; I < 10; I++) {
            for (int M = 0; M < white; M++) {
                System.out.print(2);
            }
            white++;
            System.out.println();
        }

    }
}
