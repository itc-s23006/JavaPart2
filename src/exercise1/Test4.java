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
        8
        88
        888
        8888
        88888
        888888
        8888888
        88888888
        888888888
        8888888888
        縦10  横 10
         */
        // int white = 1;
        // for (int I = 0; I < 10; I++) {
            // for (int M = 0; M < white; M++) {
                // System.out.print(2);
            // }
            // white++;
            // System.out.println();
        // }

        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        int[] array2 = {10, 20, 30};
        // --------------------------
        int[] first = {0, 1, 2};
        int[] second = {10, 11, 12};
        int[] result;

        result = new int[first.length + second.length];

    }
}
