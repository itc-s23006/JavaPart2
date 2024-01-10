package exercise1;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        String[] words = {"cat", "dog", "apple", "bear", "book"};
        // 配列の１番目の値を抜き出し表示する
        // 配列の３番目の値を抜き出し表示する
        // 配列の最後の値を抜き出し表示する
        String firstwords = words[0];
        System.out.println("１番目の値:" + firstwords);

        String thirdwords = words[2];
        System.out.println("３番めの値:" + thirdwords);

        String finalwords = words[4];
        System.out.println("最後の値:" + words[words.length-1]);

        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };
        //  真ん中の値（６）を抜き出し表示する
        System.out.println(intMatrix[1][2]);

        for (int y=0; y<intMatrix.length; y++){
            for (int x=0; x<intMatrix[0].length; x++){
                System.out.print(intMatrix[y][x] * 3 + " ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int y=0; y<intMatrix.length; y++){
            for (int x=0; x<intMatrix[0].length; x++){
                System.out.print(intMatrix[y][x] * 3 + " ");
                sum += intMatrix[y][x];
            }
        }
        System.out.println("合計:" + sum);

        int[] data1 = {1, 2, 3};
        System.out.println(Arrays.deepToString(intMatrix));
    }
}
