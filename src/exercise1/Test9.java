package exercise1;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        // 配列の値は学籍番号を表している
        // 量日とも参加した人数を求めてください
        /* int[] day1 = {3, 10, 4, 7, 8};
        int[] day2 = {9, 8, 6, 10, 1};

        int count = 0;
        for (int i=0; i<day1.length; i++){
            for (int k=0; k<day2.length; k++){
                if (day1[i] == day2[k]){
                    count++;
                }
            }
        }
        System.out.println(count);
        */

        char c = 0x0061;
        // System.out.println(c);

        char[] array = new char[3];
        array[0] = 0x0061;
        array[1] = 0x0062;
        array[2] = 0x0063;
        System.out.println(Arrays.toString(array));
    }
}
